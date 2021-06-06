package mbjs.fuzzy;

import mbjs.model.Player;

import java.util.*;

public class ComplexSummarizer extends Summarizer implements FuzzySet{

    Summarizer summarizer1;
    Summarizer summarizer2;
    List<Summarizer> summarizers = new ArrayList<>();
    boolean or;

    public ComplexSummarizer(String name, MembershipFunction membershipFunction, double a, double b, double c, double d,Summarizer s1, Summarizer s2, boolean or) {
        super(name, membershipFunction, a, b, c, d);
        this.summarizer1 = s1;
        this.summarizer2 = s2;
        this.or = or;
    }

    public ComplexSummarizer(Summarizer summarizer1, Summarizer summarizer2, boolean or) {
        this.summarizer1 = summarizer1;
        this.summarizer2 = summarizer2;
        this.or = or;
    }

    public ComplexSummarizer(boolean or) {
        this.or = or;
    }

    public boolean addAll(Collection<? extends Summarizer> collection) {
        return summarizers.addAll(collection);
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
        List<Player> s1 = summarizer1.support(players);
        List<Player> s2 = summarizer2.support(players);
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
        double cardinality = 1.0;
        for (Summarizer summarizer: summarizers){
            cardinality *= summarizer.cardinality;
        }
        return cardinality;
    }

    @Override
    public double getFuzziness(List<Player> players) {
        double fuzziness = 1.0;
        for (Summarizer summarizer: summarizers){
            fuzziness *= summarizer.cardinality;
        }
        return fuzziness;
    }
}
