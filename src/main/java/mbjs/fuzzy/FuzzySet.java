package mbjs.fuzzy;

import mbjs.model.Player;

import java.util.List;

public interface FuzzySet {

    double getMembership(Player player);

    List<Player> support(List<Player> players);

    double getFuzziness(List<Player> players);
}
