package src.strategy;

import src.player.Player;

public class AggressiveStrategy implements Strategy {
    @Override
    public void play(Player player) {
        System.out.println(player.getName() + " (Aggressive) is ready to roll!");
    }
}