package mbjs.fuzzy;

import mbjs.model.Player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComplexQualifier extends Qualifier implements FuzzySet {

    Qualifier qualifier1;
    Qualifier qualifier2;
    boolean or;

    public ComplexQualifier(String name, MembershipFunction membershipFunction, double a, double b, double c, double d,Qualifier s1, Qualifier s2, boolean or) {
        super(name, membershipFunction, a, b, c, d);
        this.qualifier1 = s1;
        this.qualifier2 = s2;
        this.or = or;
    }

    public ComplexQualifier(Qualifier qualifier1, Qualifier qualifier2, boolean or) {
        this.qualifier1 = qualifier1;
        this.qualifier2 = qualifier2;
        this.or = or;
    }

    @Override
    public String toString() {
        if (or){
            return qualifier1.toString() + " or "  + qualifier2.toString();
        }else {
            return qualifier1.toString() + " and "  + qualifier2.toString();
        }
    }

    public double getMembership(double x, double y) {
        if (or){
            return Math.max(qualifier1.getMembership(x),qualifier2.getMembership(y));
        }else {
            return Math.min(qualifier1.getMembership(x),qualifier2.getMembership(y));
        }
    }

    @Override
    public List<Player> support(List<Player> players) {
        List<Player> s1 = qualifier1.support(players);
        List<Player> s2 = qualifier2.support(players);
        if (or){
            Set<Player> set = new HashSet<>();
            set.addAll(s1);
            set.addAll(s2);
            return new ArrayList<>(set);
        } else {
            s1.retainAll(s2);
            return s1;
        }

    }

    public double getCardinality(){
        return qualifier1.cardinality*qualifier2.cardinality;
    }

    @Override
    public double getFuzziness(List<Player> players) {
        return qualifier1.getFuzziness(players) * qualifier2.getFuzziness(players);
    }
}
