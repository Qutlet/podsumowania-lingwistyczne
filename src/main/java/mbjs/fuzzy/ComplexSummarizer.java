package mbjs.fuzzy;

import mbjs.model.Player;

import java.util.*;

public class ComplexSummarizer extends Summarizer implements FuzzySet{

    Summarizer summarizer1;
    Summarizer summarizer2;
    boolean or;

    public ComplexSummarizer(String name, MembershipFunction membershipFunction, double a, double b, double c, double d,Summarizer s1, Summarizer s2, boolean or) {
        super(name, membershipFunction, a, b, c, d);
        this.summarizer1 = s1;
        this.summarizer2 = s2;
        this.or = or;
    }

    @Override
    public String toString() {
        if (or){
            return summarizer1.toString() + " or "  + summarizer2.toString();
        }else {
            return summarizer1.toString() + " and "  + summarizer2.toString();
        }
    }

    public double getMembership(double x, double y) {
        if (or){
            return Math.max(summarizer1.getMembership(x),summarizer2.getMembership(y));
        }else {
            return Math.min(summarizer1.getMembership(x),summarizer2.getMembership(y));
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

    @Override
    public double getFuzziness(List<Player> players) {
        return summarizer1.getFuzziness(players) * summarizer2.getFuzziness(players);
    }
}
