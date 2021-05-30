package mbjs.fuzzy;

import mbjs.model.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quantifier implements FuzzySet {

    String name;
    MembershipFunction membershipFunction;
    double a;
    double b;
    double c;
    double d;
    boolean isAbsolute;
    double cardinality;
    double support;

    public Quantifier(String name, MembershipFunction membershipFunction, double a, double b, double c, double d, boolean isAbsolute) {
        this.name = name;
        this.membershipFunction = membershipFunction;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.isAbsolute = isAbsolute;
        this.cardinality = membershipFunction.cardinality(a,b,c,d);
        this.support = membershipFunction.support(a,b,c,d);
    }

    @Override
    public double getMembership(double x){
        return membershipFunction.getMembership(a,b,c,d,x);
    }

    @Override
    public List<Player> support(List<Player> players) {
        return null;
    }

    @Override
    public double getFuzziness(List<Player> players) {
        return 0;
    }

    public boolean isAbsolute() {
        return isAbsolute;
    }

    @Override
    public String toString() {
        return name;
    }

}

