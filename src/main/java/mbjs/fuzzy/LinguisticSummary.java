package mbjs.fuzzy;

import mbjs.model.Player;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class LinguisticSummary {

    Quantifier quantifier;
    Summarizer summarizer;
    Qualifier qualifier;
    Double measures;

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
        DecimalFormat df = new DecimalFormat("###.##");
        if (qualifier == null){
            StringBuilder summary = new StringBuilder(quantifier + "basketball players are/have " + summarizer + " [");
//            for (Double measure : measures){
//                summary.append(df.format(measure));
//                summary.append(";");
//            }
            summary.append(measures);
            summary.append("]");
            return summary.toString();
        }else {
            StringBuilder summary = new StringBuilder(quantifier + "basketball players who are/have " + qualifier + " are/have " + summarizer + " [");
//            for (Double measure : measures){
//                summary.append(df.format(measure));
//                summary.append(";");
//            }
            summary.append(measures);
            summary.append("]");
            return summary.toString();
        }
    }

    public double T1(List<Player> players){
        double sum =0.0;
        double pom = 0.0;
        double sumB = 0.0;
        if (summarizer instanceof ComplexSummarizer){
            if (qualifier == null){
                if (quantifier.isAbsolute()) {
                    for(Player player : players){
                        sum += ((ComplexSummarizer) summarizer).getMembership(player.getPlayerStat(((ComplexSummarizer) summarizer).summarizer1.name),player.getPlayerStat(((ComplexSummarizer) summarizer).summarizer2.name));
                    }
                    pom = quantifier.getMembership(sum);
                }
                if (!quantifier.isAbsolute()){
                    for(Player player : players){
                        sum += ((ComplexSummarizer) summarizer).getMembership(player.getPlayerStat(((ComplexSummarizer) summarizer).summarizer1.name),player.getPlayerStat(((ComplexSummarizer) summarizer).summarizer2.name));
                    }
                    pom = quantifier.getMembership(sum / players.size());
                }
            }else {
                if (qualifier instanceof ComplexQualifier){
                    for(Player player : players){
                        //sum += Math.min(qualifier.getMembership(player.getPlayerStat(qualifier.name)),summarizer.getMembership(player.getPlayerStat(summarizer.name)));
                        sum += Math.min(((ComplexQualifier) qualifier).getMembership(player.getPlayerStat(((ComplexQualifier) qualifier).qualifier1.name),player.getPlayerStat(((ComplexQualifier) qualifier).qualifier2.name)),((ComplexSummarizer) summarizer).getMembership(player.getPlayerStat(((ComplexSummarizer) summarizer).summarizer1.name),player.getPlayerStat(((ComplexSummarizer) summarizer).summarizer2.name)));
                        sumB += ((ComplexQualifier) qualifier).getMembership(player.getPlayerStat(((ComplexQualifier) qualifier).qualifier1.name),player.getPlayerStat(((ComplexQualifier) qualifier).qualifier2.name));
                    }
                } else {
                    for(Player player : players){
                        sum += Math.min(qualifier.getMembership(player.getPlayerStat(qualifier.name)),summarizer.getMembership(player.getPlayerStat(summarizer.name)));
                        sumB += qualifier.getMembership(player.getPlayerStat(summarizer.name));
                    }
                }
                pom = quantifier.getMembership(sum / sumB);
            }
        }else if (qualifier instanceof ComplexQualifier) {
            for(Player player : players){
                sum += Math.min(((ComplexQualifier) qualifier).getMembership(player.getPlayerStat(((ComplexQualifier) qualifier).qualifier1.name),player.getPlayerStat(((ComplexQualifier) qualifier).qualifier2.name)),summarizer.getMembership(player.getPlayerStat(summarizer.name)));
                sumB += ((ComplexQualifier) qualifier).getMembership(player.getPlayerStat(((ComplexQualifier) qualifier).qualifier1.name),player.getPlayerStat(((ComplexQualifier) qualifier).qualifier2.name));
            }
            pom = quantifier.getMembership(sum / sumB);
        } else {
            if (qualifier == null){
                if (quantifier.isAbsolute()) {
                    for(Player player : players){
                        sum += summarizer.getMembership(player.getPlayerStat(summarizer.name));
                    }
                    pom = quantifier.getMembership(sum);
                }
                if (!quantifier.isAbsolute()){
                    for(Player player : players){
                        sum += summarizer.getMembership(player.getPlayerStat(summarizer.name));
                    }
                    pom = quantifier.getMembership(sum / players.size());
                }
            } else {
                for(Player player : players){
                    sum += Math.min(qualifier.getMembership(player.getPlayerStat(qualifier.name)),summarizer.getMembership(player.getPlayerStat(summarizer.name)));
                    sumB += qualifier.getMembership(player.getPlayerStat(summarizer.name));
                }
                pom = quantifier.getMembership(sum / sumB);
            }
        }
        return pom;
    }

    public double T2(List<Player> players, List<LinguisticSummary> linguisticSummaries){ //co to za bydle
        double pom =1.0;
//        List<LinguisticSummary> linguisticSummaryList = new ArrayList<>();
//        for (LinguisticSummary linguisticSummary : linguisticSummaries){
//            if (linguisticSummary.summarizer.name.equals(this.summarizer.name)){
//                linguisticSummaryList.add(linguisticSummary);
//            }
//        }
//        for (LinguisticSummary linguisticSummary : linguisticSummaryList){
//            pom *= linguisticSummary.summarizer.getFuzziness(players);
//        }
        pom *= summarizer.getFuzziness(players);
        if (summarizer instanceof ComplexSummarizer){
            return 1 - Math.pow(pom,1.0 / 2.0);
        }
        return 1 - Math.pow(pom,1.0 / 1.0);
    }

    public double T3(List<Player> players){
        double s = 0.0;
        double q = 0.0;
        for (Player player : players){
            if (summarizer instanceof ComplexSummarizer){
                if (qualifier == null){
                    if (((ComplexSummarizer) summarizer).getMembership(player.getPlayerStat(((ComplexSummarizer) summarizer).summarizer1.name),player.getPlayerStat(((ComplexSummarizer) summarizer).summarizer2.name)) > 0){
                        s++;
                    }
                } else {
                    if (((ComplexQualifier) qualifier).getMembership(player.getPlayerStat(((ComplexQualifier) qualifier).qualifier1.name),player.getPlayerStat(((ComplexQualifier) qualifier).qualifier2.name)) > 0){
                        q++;
                        if (((ComplexSummarizer) summarizer).getMembership(player.getPlayerStat(((ComplexSummarizer) summarizer).summarizer1.name),player.getPlayerStat(((ComplexSummarizer) summarizer).summarizer2.name)) > 0) {
                            s++;
                        }
                    }
                }

            } else if (qualifier instanceof ComplexQualifier){
                if (((ComplexQualifier) qualifier).getMembership(player.getPlayerStat(((ComplexQualifier) qualifier).qualifier1.name),player.getPlayerStat(((ComplexQualifier) qualifier).qualifier2.name)) > 0){
                    q++;
                    if (summarizer.getMembership(player.getPlayerStat(summarizer.name)) > 0) {
                        s++;
                    }
                }
            }else {
                if (qualifier == null){
                    if (summarizer.getMembership(player.getPlayerStat(summarizer.name)) > 0){
                        s++;
                    }
                }
                else {
                    if (qualifier.getMembership(player.getPlayerStat(qualifier.name)) > 0){
                        q++;
                        if (summarizer.getMembership(player.getPlayerStat(summarizer.name)) > 0) {
                            s++;
                        }
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
            double pom2 = 0.0;
            for (Player player : players){
                if (summarizer instanceof ComplexSummarizer){
                    pom2 += ((ComplexSummarizer) summarizer).getMembership(player.getPlayerStat(((ComplexSummarizer) summarizer).summarizer1.name),player.getPlayerStat(((ComplexSummarizer) summarizer).summarizer2.name));
                } else {
                    pom2 += summarizer.getMembership(player.getPlayerStat(summarizer.name));
                }
            }
            pom *= pom2 / players.size();
        return Math.abs(pom - T3(players));
    }

    public double T5(List<LinguisticSummary> linguisticSummaries){
        List<LinguisticSummary> linguisticSummaryList = new ArrayList<>();
        for (LinguisticSummary linguisticSummary : linguisticSummaries){
            if (linguisticSummary.summarizer.name.equals(this.summarizer.name)){
                linguisticSummaryList.add(linguisticSummary);
            }
        }
        return 2 * Math.pow(0.5,linguisticSummaryList.size());
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

    public double T8(List<Player> players, List<LinguisticSummary> linguisticSummaries){
        List<LinguisticSummary> linguisticSummaryList = new ArrayList<>();
        for (LinguisticSummary linguisticSummary : linguisticSummaries){
            if (linguisticSummary.summarizer.name.equals(this.summarizer.name)){
                linguisticSummaryList.add(linguisticSummary);
            }
        }
        double pom = 1.0;
        for (LinguisticSummary linguisticSummary : linguisticSummaryList){
            pom *= linguisticSummary.summarizer.cardinality / players.size();
        }
        return 1.0 - Math.pow(pom,1.0/linguisticSummaryList.size());
    }

    public double T9(List<Player> players, List<LinguisticSummary> linguisticSummaries){
//        if (qualifier == null){
//            return 0.0;
//        }
//        List<LinguisticSummary> linguisticSummaryList = new ArrayList<>();
//        for (LinguisticSummary linguisticSummary : linguisticSummaries){
//            if (linguisticSummary.qualifier.name.equals(this.qualifier.name)){
//                linguisticSummaryList.add(linguisticSummary);
//            }
//        }
//        double pom = 1.0;
//        for (LinguisticSummary linguisticSummary : linguisticSummaryList){
//            pom *= linguisticSummary.getFuzziness3(players);
//        }
//        return 1.0 - Math.pow(pom,1.0/linguisticSummaryList.size());
        return 1.0 - qualifier.getFuzziness(players);
    }

    public double T10(List<Player> players) {
//        if (qualifier == null){
//            return 0.0;
//        }
//        List<LinguisticSummary> linguisticSummaryList = new ArrayList<>();
//        for (LinguisticSummary linguisticSummary : linguisticSummaries){
//            if (linguisticSummary.qualifier.name.equals(this.qualifier.name)){
//                linguisticSummaryList.add(linguisticSummary);
//            }
//        }
//        double pom = 1.0;
//        for (LinguisticSummary linguisticSummary : linguisticSummaryList){
//            pom *= linguisticSummary.qualifier.cardinality;
//        }
//        return 1.0 - Math.pow(pom,1.0/linguisticSummaryList.size());
        return 1.0 - qualifier.cardinality / players.size();
    }

    public double T11(List<LinguisticSummary> linguisticSummaries){
        if (qualifier == null){
            return 0.0;
        }
        List<LinguisticSummary> linguisticSummaryList = new ArrayList<>();
        for (LinguisticSummary linguisticSummary : linguisticSummaries){
            if (linguisticSummary.qualifier.name.equals(this.qualifier.name)){
                linguisticSummaryList.add(linguisticSummary);
            }
        }
        return 2 * Math.pow(0.5,linguisticSummaryList.size());
    }


    public void calculateMeasures(List<LinguisticSummary> linguisticSummaries, List<Player> players){
        List<Double> measures = new ArrayList<>();
        measures.add(T1(players));
        measures.add(T2(players,linguisticSummaries));
        measures.add(T3(players));
        measures.add(T4(players,linguisticSummaries));
        measures.add(T5(linguisticSummaries));
        measures.add(T6(players));
        measures.add(T7(players));
        measures.add(T8(players, linguisticSummaries));
        measures.add(T9(players,linguisticSummaries));
        measures.add(T10(players));
        measures.add(T11(linguisticSummaries));
        measures.forEach(System.out::println);
        double pom = 0.0;
        for (Double me : measures){
            pom += ((1.0 / 11)*me);
        }
        this.measures = pom;
    }

}
