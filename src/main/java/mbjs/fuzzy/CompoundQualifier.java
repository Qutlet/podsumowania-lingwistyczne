package mbjs.fuzzy;

import mbjs.model.Player;

import java.util.*;

public class CompoundQualifier extends Qualifier implements FuzzySet {

    List<Qualifier> qualifiers = new ArrayList<>();
    boolean or;

    public CompoundQualifier(boolean or) {
        this.or = or;
    }

    public boolean add(Qualifier qualifier) {
        return qualifiers.add(qualifier);
    }

    public void addAll(Collection<? extends Qualifier> collection) {
        qualifiers.addAll(collection);
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
        List<Player> supports = new ArrayList<>();
        for (Qualifier qualifier : qualifiers){
            supports.addAll(qualifier.support(players));
        }
        if (or){
            Set<Player> set = new HashSet<>(supports);
            return new ArrayList<>(set);
        } else {
            for (Qualifier qualifier : qualifiers) {
                supports.retainAll(qualifier.support(players));
            }
            return supports;
        }
    }

    @Override
    public double getFuzziness(List<Player> players) {
        double fuzziness = 1.0;
        for (Qualifier qualifier : qualifiers){
            fuzziness *= qualifier.getFuzziness(players);
        }
        return fuzziness;
    }

    @Override
    public double getCardinality(List<Player> players) {
        double cardinality = 1.0;
        for (Qualifier qualifier : qualifiers){
            cardinality *= qualifier.getCardinality(players) / players.size();
        }
        return cardinality;
    }
}
