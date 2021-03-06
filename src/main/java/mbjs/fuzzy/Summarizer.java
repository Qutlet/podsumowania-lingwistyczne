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

    public Summarizer(String name, MembershipFunction membershipFunction, double a, double b, double c, double d, List<Player> players) {
        this.name = name;
        this.membershipFunction = membershipFunction;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        for (Player player : players) {
            universe.add(player.getPlayerStat(name));
        }
    }

    public Summarizer() {
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
        return  ((double) support(players).size()) / ((double) players.size());
    }

    @Override
    public double getCardinality(List<Player> players) {
        double sum = 0.0;
        for (Player player : players){
            sum += getMembership(player);
        }
        return sum;
    }
}
