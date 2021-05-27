package mbjs.fuzzy;

import mbjs.model.Player;

import java.util.ArrayList;
import java.util.List;

public class LinguisticSummary {

    Quantifier quantifier;
    Summarizer summarizer;
    Qualifier qualifier;
    Measures measures = new Measures();

    public LinguisticSummary(Quantifier quantifier, Qualifier qualifier, Summarizer summarizer) {
        this.quantifier = quantifier;
        this.summarizer = summarizer;
        this.qualifier = qualifier;
        //
    }

    public LinguisticSummary(Quantifier quantifier, Summarizer summarizer) {
        this.quantifier = quantifier;
        this.summarizer = summarizer;
    }


    @Override
    public String toString() {
        if (qualifier == null){
            return quantifier + "basketball players are/have " + summarizer;
        }else {
            return quantifier + "basketball players who are/have " + qualifier + " are/have " + summarizer;
        }
    }

    public String summaryP1F1(){
        return quantifier + "basketball players are/have " + summarizer;
    }

    public String summaryP1F2(){
        return quantifier + "basketball players who are/have " + qualifier + " are/have " + summarizer;
    }

    public List<Player> support(List<Player> players){
        List<Player> support = new ArrayList<>();
        for (Player player : players) {
            if (summarizer.getMembership(player.getGP()) > 0) {
                support.add(player);
            }
        }
        return support;
    }

    public double support2(List<Player> players){
        List<Player> support = new ArrayList<>();
        for (Player player : players) {
            if (quantifier.getMembership(player.getGP()) > 0) {
                support.add(player);
            }
        }
        return support.size(); //no no no
        //todo czym jest nosnik w kwantyfikatorze kurwa
    }

    public List<Player> support3(List<Player> players){
        List<Player> support = new ArrayList<>();
        for (Player player : players) {
            if (qualifier.getMembership(player.getGP()) > 0) {
                support.add(player);
            }
        }
        return support;
    }

    public double getFuzziness(List<Player> players){
        return ((double) support(players).size()) / ((double) players.size());
    }

    public double T1(List<Player> players){
        double sum =0.0;
        double pom = 0.0;
        double sumB = 0.0;
        if (qualifier == null){
            if (quantifier.isAbsolute()) {
                for(Player player : players){
                    sum += summarizer.getMembership(player.getGP());
                }
                pom = quantifier.getMembership(sum);
            }
            if (!quantifier.isAbsolute()){
                for(Player player : players){
                    sum += summarizer.getMembership(player.getGP());
                }
                pom = quantifier.getMembership(sum / players.size());
            }
        } else {
            for(Player player : players){
                sum += Math.min(qualifier.getMembership(player.getGP()),summarizer.getMembership(player.getGP()));
                sumB += qualifier.getMembership(player.getGP());
            }
            pom = quantifier.getMembership(sum / sumB);
        }
        return pom;
    }

    public double T2(List<Player> players, List<LinguisticSummary> linguisticSummaries){ //co to za bydle
        double pom =1.0;
        for (LinguisticSummary linguisticSummary : linguisticSummaries){
            if (linguisticSummary.summarizer.name.equals(this.summarizer.name)){

            }
            pom *= linguisticSummary.getFuzziness(players);
        }
        return 1 - Math.pow(pom,1.0 / linguisticSummaries.size());
    }

    public double T3(List<Player> players){
        double s = 0.0;
        double q = 0.0;
        for (Player player : players){
            if (qualifier == null){
                if (summarizer.getMembership(player.getGP()) > 0){
                    s++;
                }
            }
            else {
                if (qualifier.getMembership(player.getGP()) > 0){
                    q++;
                    if (summarizer.getMembership(player.getGP()) > 0) {
                        s++;
                    }
                }
            }

        }
        if (qualifier == null){
            return s/ players.size();
        } else {
            return s / q;
        }
    }

    public double T4(List<Player> players, List<LinguisticSummary> linguisticSummaries){ //o panie to ty na mnie spojrzales
        double pom = 1.0;
        for (LinguisticSummary linguisticSummary : linguisticSummaries){
            double pom2 = 0.0;
            for (Player player : players){
                pom2 += linguisticSummary.summarizer.getMembership(player.getPlayerStat(summarizer.name));
            }
            pom *= pom2 / players.size();
        }
        return Math.abs(pom);
    }

    public double T5(List<LinguisticSummary> linguisticSummaries){
        return 2 * Math.pow(0.5,linguisticSummaries.size());
    }

    public double T6(List<Player> players){
        double pom = support2(players);
        if (quantifier.isAbsolute()){
            pom /= players.size();
        }
        return 1 - pom;
    }

    public double T7(List<Player> players){
        //todo kardnyal kwantyfikator
        return 0.0;
    }

    public double T8(List<Player> players){
        //todo kardynal wojtyla sumaryzator
        return 0.0;
    }

    public double T9(List<Player> players){
        return 1 - support3(players).size();
    }

}
