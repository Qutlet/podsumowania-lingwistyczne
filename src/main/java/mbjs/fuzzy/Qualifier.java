package mbjs.fuzzy;

import mbjs.model.Player;

import java.util.ArrayList;
import java.util.List;

public class Qualifier implements FuzzySet {

    String name;
    MembershipFunction membershipFunction;
    double a;
    double b;
    double c;
    double d;
    double cardinality;

    public Qualifier(String name, MembershipFunction membershipFunction, double a, double b, double c, double d) {
        this.name = name;
        this.membershipFunction = membershipFunction;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.cardinality = membershipFunction.cardinality(a,b,c,d);
    }

    public Qualifier() {
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public double getMembership(Player player) {
        return membershipFunction.getMembership(a,b,c,d,player.getPlayerStat(name));
    }

    @Override
    public List<Player> support(List<Player> players) {
        List<Player> support = new ArrayList<>();
        for (Player player : players) {
            if (getMembership(player) > 0) {
                support.add(player);
            }
        }
        return support;
    }

    @Override
    public double getFuzziness(List<Player> players) {
        return ((double) support(players).size()) / ((double) players.size());
    }

}
