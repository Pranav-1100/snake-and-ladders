package src.strategy;

import src.player.Player;

public class DefensiveStrategy implements Strategy {
    @Override
    public void play(Player player) {
        System.out.println(player.getName() + " (Defensive) plays carefully...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}