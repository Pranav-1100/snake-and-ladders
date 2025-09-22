package src.factory;

import src.player.BotPlayer;
import src.player.HumanPlayer;
import src.player.Player;
import src.strategy.Strategy;

public class PlayerFactory {
    public static Player createHumanPlayer(String name) {
        return new HumanPlayer(name);
    }

    public static Player createBotPlayer(String name, Strategy strategy) {
        return new BotPlayer(name, strategy);
    }
}