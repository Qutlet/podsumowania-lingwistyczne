package mbjs.fuzzy;

import mbjs.model.Player;

import java.util.*;

public class ComplexSummarizer extends Summarizer implements FuzzySet{

    List<Summarizer> summarizers = new ArrayList<>();
    boolean or;

    public ComplexSummarizer(boolean or) {
        this.or = or;
    }

    public void addAll(Collection<? extends Summarizer> collection) {
        summarizers.addAll(collection);
    }

    public int size() {
        return summarizers.size();
    }

    public List<Summarizer> getSummarizers() {
        return summarizers;
    }

    @Override
    public String toString() {
        StringBuilder summary = new StringBuilder();
        if (or){
            for (Summarizer qualifier : summarizers){
                summary.append(qualifier.toString());
                if (summarizers.indexOf(qualifier) != summarizers.size()-1){
                    summary.append(" or ");
                }
            }
        } else {
            for (Summarizer qualifier : summarizers){
                summary.append(qualifier.toString());
                if (summarizers.indexOf(qualifier) != summarizers.size()-1){
                    summary.append(" and ");
                }
            }
        }
        return summary.toString();
    }

    public double getMembership(Player player) {
        List<Double> doubles = new ArrayList<>();
        for (Summarizer summarizer : summarizers){
            doubles.add(summarizer.getMembership(player));
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
        for (Summarizer summarizer : summarizers) {
            supports.addAll(summarizer.support(players));
        }
        if (or){
            Set<Player> set = new HashSet<>(supports);
            return new ArrayList<>(set);
        } else {
            for (Summarizer summarizer : summarizers) {
                supports.retainAll(summarizer.support(players));
            }
            return supports;
        }

    }

    @Override
    public double getFuzziness(List<Player> players) {
        double fuzziness = 1.0;
        for (Summarizer summarizer: summarizers){
            fuzziness *= summarizer.getFuzziness(players);
        }
        return fuzziness;
    }

    @Override
    public double getCardinality(List<Player> players) {
        double cardinality = 1.0;
        for (Summarizer summarizer: summarizers){
            cardinality *= summarizer.getCardinality(players) / players.size();
        }
        return cardinality;
    }
}
