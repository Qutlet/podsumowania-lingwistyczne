package mbjs.fuzzy;

import mbjs.model.Player;

import java.util.List;

public class Measures {

    private Quantifier quantifier = Quantifier.getInstance();
    private Summarizer summarizer = Summarizer.getInstance();

    public double T1(List<Player> players){
        double r1 = 0;
        for (Player player : players){
            r1 += summarizer.calculateGamesPlayed(player.getGP()).getA();
        }
        System.out.println(r1);
        System.out.println(players.size());
        return quantifier.calculateQuantifierRelative(r1 / players.size()).getA();
    }
}
