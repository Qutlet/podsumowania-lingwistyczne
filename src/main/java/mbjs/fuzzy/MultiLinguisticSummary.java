package mbjs.fuzzy;

import mbjs.model.Player;

import java.util.ArrayList;
import java.util.List;

public class MultiLinguisticSummary {

    List<Player> p1;
    String p1Name;
    List<Player> p2;
    String p2Name;
    Quantifier quantifier;
    Summarizer summarizer;
    Qualifier qualifier;
    int form;

    public MultiLinguisticSummary(List<Player> p1, String p1Name, List<Player> p2, String p2Name, Quantifier quantifier, Summarizer summarizer, int form) { //1 forma
        this.p1 = p1;
        this.p1Name = p1Name;
        this.p2 = p2;
        this.p2Name = p2Name;
        this.quantifier = quantifier;
        this.summarizer = summarizer;
        this.form = form;
    }

    public MultiLinguisticSummary(List<Player> p1, String p1Name, List<Player> p2, String p2Name, Quantifier quantifier, Summarizer summarizer, Qualifier qualifier, int form) { // 2 i 3 forma
        this.p1 = p1;
        this.p1Name = p1Name;
        this.p2 = p2;
        this.p2Name = p2Name;
        this.quantifier = quantifier;
        this.summarizer = summarizer;
        this.qualifier = qualifier;
        this.form = form;
    }

    public MultiLinguisticSummary(List<Player> p1, String p1Name, List<Player> p2, String p2Name, Summarizer summarizer, int form) { // 4 forma
        this.p1 = p1;
        this.p1Name = p1Name;
        this.p2 = p2;
        this.p2Name = p2Name;
        this.summarizer = summarizer;
        this.form = form;
    }

    @Override
    public String toString() {
        if (form == 1) {
            return quantifier + "basketball player who are from " + p1Name + " compare to players from " + p2Name + " are/have " + summarizer;
        } else if (form == 2){
            return quantifier + "basketball player who are from " + p1Name + " compare to players from " + p2Name + " who are " + qualifier + " are/have " +summarizer;
        } else if (form == 3){
            return quantifier + "basketball player who are from " + p1Name + "who are " + qualifier + " compare to players from " + p2Name + " are/have " +summarizer;
        } else if (form == 4){
            return "More basketball player who are from "+ p1Name + " than players who are from " + p2Name + " are/have " + summarizer;
        } else {
            return "Error while creating summary";
        }
    }

    private double getP1Cardinality(){
        double sum = 0.0;
        for (Player player : p1){
            sum += summarizer.getMembership(player.getPlayerStat(summarizer.name));
        }
        return sum;
    }

    private double getP2Cardinality(){
        double sum = 0.0;
        for (Player player : p2){
            sum += summarizer.getMembership(player.getPlayerStat(summarizer.name));
        }
        return sum;
    }

    private double T(){
        if (form == 1){
            double up = getP1Cardinality() / p1.size();
            double down = getP1Cardinality() / p1.size() + getP2Cardinality() / p2.size();
            return quantifier.getMembership(up /  down);
        } else {
            return -1.0;
        }
    }
}
