package mbjs.fuzzy;

import mbjs.model.Player;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class LinguisticSummary {

    Quantifier quantifier;
    Summarizer summarizer;
    Qualifier qualifier;
    double measures;

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
            String summary = quantifier + "basketball players are/have " + summarizer + " [";
            summary += measures;
//            for (Double measure : measures){
//                summary += (df.format(measure));
//                summary += (";");
//            }
            return summary + "]\n";
        }else {
            String summary =quantifier + "basketball players who are/have " + qualifier + " are/have " + summarizer + " [";
            summary += measures;
//            for (Double measure : measures){
//                summary += (df.format(measure));
//                summary += (";");
//            }
            return summary + "]\n";
        }
    }

    public double T1(List<Player> players){
        double sum =0.0;
        double pom = 0.0;
        double sumB = 0.0;
        double pom2 = 0.0;
//        if (summarizer instanceof ComplexSummarizer){
//            if (qualifier == null){
//                for (Player player : players){
//                    sum+= summarizer.getMembership(player);
//                }
//                if (quantifier.isAbsolute()) {
//                 //   for (Player player : players){
//                   //     sum+= summarizer.getMembership(player);
//                   // }
//                    pom = quantifier.getMembership(sum);
//                }
//                if (!quantifier.isAbsolute()){
//                    //((ComplexSummarizer) summarizer).getMembership(players);
//                    pom = quantifier.getMembership(sum / players.size());
//                }
//            }else {
//                if (qualifier instanceof ComplexQualifier){
//                    sum = Math.min(((ComplexSummarizer) summarizer).getMembership(players),((ComplexQualifier) qualifier).getMembership(players));
//                    sumB = ((ComplexQualifier) qualifier).getMembership(players);
//                } else {
//                    for(Player player : players){
//                        pom2 += qualifier.getMembership(player);
//                        sumB += qualifier.getMembership(player);
//                    }
//                    sum = Math.min(pom2,((ComplexSummarizer) summarizer).getMembership(players));
//                }
//                pom = quantifier.getMembership(sum / sumB);
//            }
//        }else if (qualifier instanceof ComplexQualifier) {
//            for(Player player : players){
//                //sum += Math.min(((ComplexQualifier) qualifier).getMembership(player.getPlayerStat(((ComplexQualifier) qualifier).qualifier1.name),player.getPlayerStat(((ComplexQualifier) qualifier).qualifier2.name)),summarizer.getMembership(player.getPlayerStat(summarizer.name)));
//                //sumB += ((ComplexQualifier) qualifier).getMembership(player.getPlayerStat(((ComplexQualifier) qualifier).qualifier1.name),player.getPlayerStat(((ComplexQualifier) qualifier).qualifier2.name));
//            }
//            pom = quantifier.getMembership(sum / sumB);
//        } else {
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
       // }
        return pom;
    }

    public double T2(List<Player> players){
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
            return 1 - Math.pow(pom,1.0 / ((ComplexSummarizer) summarizer).size());
        }
        return 1 - Math.pow(pom,1.0 / 1.0);
    }

    public double T3(List<Player> players){
        double s = 0.0;
        double q = 0.0;
        for (Player player : players){
//            if (summarizer instanceof ComplexSummarizer){
//                if (qualifier == null){
//                    if (((ComplexSummarizer) summarizer).getMembership(player.getPlayerStat(((ComplexSummarizer) summarizer).summarizer1.name),player.getPlayerStat(((ComplexSummarizer) summarizer).summarizer2.name)) > 0){
//                        s++;
//                    }
//                } else {
//                    if (((ComplexQualifier) qualifier).getMembership(player.getPlayerStat(((ComplexQualifier) qualifier).qualifier1.name),player.getPlayerStat(((ComplexQualifier) qualifier).qualifier2.name)) > 0){
//                        q++;
//                        if (((ComplexSummarizer) summarizer).getMembership(player.getPlayerStat(((ComplexSummarizer) summarizer).summarizer1.name),player.getPlayerStat(((ComplexSummarizer) summarizer).summarizer2.name)) > 0) {
//                            s++;
//                        }
//                    }
//                }
//
//            } else if (qualifier instanceof ComplexQualifier){
//                if (((ComplexQualifier) qualifier).getMembership(player.getPlayerStat(((ComplexQualifier) qualifier).qualifier1.name),player.getPlayerStat(((ComplexQualifier) qualifier).qualifier2.name)) > 0){
//                    q++;
//                    if (summarizer.getMembership(player.getPlayerStat(summarizer.name)) > 0) {
//                        s++;
//                    }
//                }
//            }else {
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
            //}
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
            for (Player player : players){
                //if (summarizer instanceof ComplexSummarizer){
                  //  pom2 += ((ComplexSummarizer) summarizer).getMembership(player),player.getPlayerStat(((ComplexSummarizer) summarizer).summarizer2.name));
                //} else {
                    pom2 += summarizer.getMembership(player);
                //}
            }
            pom *= pom2 / players.size();
        return Math.abs(pom - T3(players));
    }

    public double T5(){
        if (summarizer instanceof ComplexSummarizer){
            return 2 * Math.pow(0.5,((ComplexSummarizer) summarizer).size());

        } else {
            return 2 * Math.pow(0.5,1);
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
        if (summarizer instanceof ComplexSummarizer){
            pom *= summarizer.getCardinality(players);
            System.out.println(pom);
            return 1.0 - Math.pow(pom,1.0/((ComplexSummarizer) summarizer).size());
        } else {
            pom *= summarizer.getCardinality(players) / players.size();
            return 1.0 - Math.pow(pom,1.0/1);
        }
    }

    public double T9(List<Player> players){
        if (qualifier == null){
            return 0.0;
        }
        return 1.0 - qualifier.getFuzziness(players);
    }

    public double T10(List<Player> players) {
        if (qualifier == null){
            return 0.0;
        }
        if (qualifier instanceof ComplexQualifier){
            return 1.0 - qualifier.getCardinality(players);
        }
        return 1.0 - qualifier.getCardinality(players) / players.size();
    }

    public double T11(){
        if (qualifier == null){
            return 0.0;
        }
        if (qualifier instanceof ComplexQualifier){
            return 2 * Math.pow(0.5,((ComplexQualifier) qualifier).size());
        } else {
            return 2 * Math.pow(0.5,1);
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
        //measures.forEach(System.out::println);
        double pom = 0.0;
        for (Double me : measures){
            pom += ((1.0 / 11)*me);
            //System.out.println(me);
        }
        //System.out.println("nowe");
        this.measures = pom;
    }

//    public void saveAsCsv(){
//        try {
//            FileWriter fileWriter = new FileWriter("new.csv");
//            fileWriter.append("Name");
//            fileWriter.append(",");
//            fileWriter.append("Type");
//            fileW
//            riter.append(",");
//            fileWriter.append("T");
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}
