package mbjs.fuzzy;

import mbjs.model.Player;

import java.util.ArrayList;
import java.util.List;

public class Summarizer implements FuzzySet {

    String name;
    MembershipFunction membershipFunction;
    double a;
    double b;
    double c;
    double d;
    double cardinality;

    public Summarizer(String name, MembershipFunction membershipFunction, double a, double b, double c, double d) {
        this.name = name;
        this.membershipFunction = membershipFunction;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.cardinality = membershipFunction.cardinality(a,b,c,d);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public double getMembership(double x) {
        return membershipFunction.getMembership(a,b,c,d,x);
    }

    @Override
    public List<Player> support(List<Player> players) {
        List<Player> support = new ArrayList<>();
        for (Player player : players) {
            if (getMembership(player.getPlayerStat(name)) > 0) {
                support.add(player);
            }
        }
        return support;
    }

    @Override
    public double getFuzziness(List<Player> players) {
        return  ((double) support(players).size()) / ((double) players.size());
    }
}
