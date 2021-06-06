package mbjs.fuzzy;

import mbjs.model.Player;

import java.util.*;

public class ComplexQualifier extends Qualifier implements FuzzySet {

    Qualifier qualifier1;
    Qualifier qualifier2;
    List<Qualifier> qualifiers = new ArrayList<>();
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

    public ComplexQualifier(boolean or) {
        this.or = or;
    }

    public boolean add(Qualifier qualifier) {
        return qualifiers.add(qualifier);
    }

    public boolean addAll(Collection<? extends Qualifier> collection) {
        return qualifiers.addAll(collection);
    }

    public List<Qualifier> getQualifiers() {
        return qualifiers;
    }

    public int size() {
        return qualifiers.size();
    }

    @Override
    public String toString() {
        StringBuilder summary = new StringBuilder();
        if (or){
            for (Qualifier qualifier : qualifiers){
                summary.append(qualifier.toString());
                if (qualifiers.indexOf(qualifier) != qualifiers.size()-1){
                    summary.append(" or ");
                }
            }
        } else {
            for (Qualifier qualifier : qualifiers){
                summary.append(qualifier.toString());
                if (qualifiers.indexOf(qualifier) != qualifiers.size()-1){
                    summary.append(" and ");
                }
            }
        }
        return summary.toString();
    }

    public double getMembership(Player player) {
        List<Double> doubles = new ArrayList<>();
        for (Qualifier qualifier : qualifiers){
                doubles.add(qualifier.getMembership(player));
        }
        Collections.sort(doubles);
        if (or){
            return doubles.get(doubles.size()-1);
        }else {
            return doubles.get(0);
        }
    }

    @Override
    public List<Player> support(List<Player> players) {
        List<Player> s1 = qualifier1.support(players);
        List<Player> s2 = qualifier2.support(players);
        List<Player> supports = new ArrayList<>();
        for (Qualifier qualifier : qualifiers){
            supports.addAll(qualifier.support(players));
        }
        if (or){
            Set<Player> set = new HashSet<>(supports);
            return new ArrayList<>(set);
        } else { //todo and
            s1.retainAll(s2);
            return s1;
        }
    }

    public double getCardinality(){
        double cardinality = 1.0;
        for (Qualifier qualifier : qualifiers){
            cardinality *= qualifier.cardinality;
        }
        return cardinality;
    }

    @Override
    public double getFuzziness(List<Player> players) {
        double fuzziness = 1.0;
        for (Qualifier qualifier : qualifiers){
            fuzziness *= qualifier.getFuzziness(players);
        }
        return fuzziness;
    }
}
