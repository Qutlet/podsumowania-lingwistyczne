package mbjs.fuzzy;

import mbjs.model.Player;

import java.util.List;

public class Measures {

//    private Quantifier quantifier = Quantifier.getInstance();
//    private Summarizer summarizer = new Summarizer("test",new TriangularFunction(),0,0,12,23);
//
//    public double T1(List<Player> players){
//        double r1 = 0;
//        for (Player player : players){
//            r1 += summarizer.getMembership(player.getGP());
//        }
//        System.out.println(r1);
//        System.out.println(players.size());
//        return quantifier.calculateQuantifierRelative(r1 / players.size()).getA();
//    }

    public double T1;
    public double T2;
    public double T3;
    public double T4;
    public double T5;
    public double T6;
    public double T7;
    public double T8;
    public double T9;
    public double T10;
    public double T11;

    public Measures(double t1, double t2, double t3, double t4, double t5, double t6, double t7, double t8, double t9, double t10, double t11) {
        T1 = t1;
        T2 = t2;
        T3 = t3;
        T4 = t4;
        T5 = t5;
        T6 = t6;
        T7 = t7;
        T8 = t8;
        T9 = t9;
        T10 = t10;
        T11 = t11;
    }
}
