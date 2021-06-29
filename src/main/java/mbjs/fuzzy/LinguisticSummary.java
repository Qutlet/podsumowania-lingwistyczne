package mbjs.fuzzy;

import mbjs.model.Player;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class LinguisticSummary implements Comparable<LinguisticSummary> {

    Quantifier quantifier;
    Summarizer summarizer;
    Qualifier qualifier;
    double measuresOpt;
    List<Double> measures = new ArrayList<>();

    public LinguisticSummary(Quantifier quantifier, Qualifier qualifier, Summarizer summarizer) {
        this.quantifier = quantifier;
        this.summarizer = summarizer;
        this.qualifier = qualifier;
    }

    public LinguisticSummary(Quantifier quantifier, Summarizer summarizer) {
        this.quantifier = quantifier;
        this.summarizer = summarizer;
    }


    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###.##");
        if (qualifier == null){
            String summary = quantifier + "basketball players are/have " + summarizer + " T[" + measuresOpt + "]\n";
//            for (Double measure : measures){
//                summary += (df.format(measure));
//                summary += (";");
//            }
            return summary;
        }else {
            String summary = quantifier + "basketball players who are/have " + qualifier + " are/have " + summarizer + " T[" + measuresOpt + "]\n";
//            for (Double measure : measures){
//                summary += (df.format(measure));
//                summary += (";");
//            }
            return summary;
        }
    }

    public double T1(List<Player> players){
        double sum =0.0;
        double pom = 0.0;
        double sumB = 0.0;
        double pom2 = 0.0;
            if (qualifier == null){
                if (quantifier.isAbsolute()) {
                    for(Player player : players){
                        sum += summarizer.getMembership(player);
                    }
                    pom = quantifier.getMembership(sum);
                }
                if (!quantifier.isAbsolute()){
                    for(Player player : players){
                        sum += summarizer.getMembership(player);
                    }
                    pom = quantifier.getMembership(sum / players.size());
                }
            } else {
                for(Player player : players){
                    sum += Math.min(qualifier.getMembership(player),summarizer.getMembership(player));
                    sumB += qualifier.getMembership(player);
                }
                pom = quantifier.getMembership(sum / sumB);
            }
        return pom;
    }

    public double T2(List<Player> players) {
        double pom = 1.0;
        pom *= summarizer.getFuzziness(players);
        if (summarizer instanceof CompoundSummarizer) {
            return 1 - Math.pow(pom, 1.0 / ((CompoundSummarizer) summarizer).size());
        }
        return 1 - Math.pow(pom, 1.0 / 1.0);
    }

    public double T3(List<Player> players){
        double s = 0.0;
        double q = 0.0;
        for (Player player : players){
                if (qualifier == null){
                    if (summarizer.getMembership(player) > 0){
                        s++;
                    }
                }
                else {
                    if (qualifier.getMembership(player) > 0){
                        q++;
                        if (summarizer.getMembership(player) > 0) {
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

    public double T4(List<Player> players){
        double pom = 1.0;
            double pom2 = 0.0;
            for (Player player : players) {
                if (summarizer.getMembership(player) > 0) {
                    pom2++;
                }
            }
            pom *= pom2 / players.size();
        return Math.abs(pom - T3(players));
    }

    public double T5() {
        if (summarizer instanceof CompoundSummarizer) {
            return 2 * Math.pow(0.5, ((CompoundSummarizer) summarizer).size());

        } else {
            return 2 * Math.pow(0.5, 1);
        }
    }

    public double T6(List<Player> players){
        double pom = quantifier.support;
        if (quantifier.isAbsolute()){
            pom /= players.size();
        }
        return 1 - pom;
    }

    public double T7(List<Player> players){
        if (quantifier.isAbsolute()){
            return 1 - (quantifier.cardinality / players.size());
        } else {
            return 1 - quantifier.cardinality;
        }
    }

    public double T8(List<Player> players){
        double pom = 1.0;
        if (summarizer instanceof CompoundSummarizer) {
            pom *= summarizer.getCardinality(players);
            return 1.0 - Math.pow(pom, 1.0 / ((CompoundSummarizer) summarizer).size());
        } else {
            pom *= summarizer.getCardinality(players) / players.size();
            return 1.0 - Math.pow(pom, 1.0 / 1);
        }
    }

    public double T9(List<Player> players){
        if (qualifier == null){
            return 0.0;
        }
        return 1.0 - qualifier.getFuzziness(players);
    }

    public double T10(List<Player> players) {
        if (qualifier == null) {
            return 0.0;
        }
        if (qualifier instanceof CompoundQualifier) {
            return 1.0 - qualifier.getCardinality(players);
        }
        return 1.0 - qualifier.getCardinality(players) / players.size();
    }

    public double T11() {
        if (qualifier == null) {
            return 1.0;
        }
        if (qualifier instanceof CompoundQualifier) {
            return 2 * Math.pow(0.5, ((CompoundQualifier) qualifier).size());
        } else {
            return 2 * Math.pow(0.5, 1);
        }
    }


    public void calculateMeasures(List<Player> players){
        List<Double> measures = new ArrayList<>();
        measures.add(T1(players));
        measures.add(T2(players));
        measures.add(T3(players));
        measures.add(T4(players));
        measures.add(T5());
        measures.add(T6(players));
        measures.add(T7(players));
        measures.add(T8(players));
        measures.add(T9(players));
        measures.add(T10(players));
        measures.add(T11());
        double pom = 0.0;
        for (Double me : measures) {
            pom += ((1.0 / 11) * me);
        }
        this.measuresOpt = pom;
        this.measures = measures;
    }

    @Override
    public int compareTo(LinguisticSummary linguisticSummary) {
        return Double.compare(linguisticSummary.measuresOpt, this.measuresOpt);
    }

}
