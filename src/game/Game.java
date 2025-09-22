package src.game;

import src.board.Board;
import src.player.Player;
import src.rules.MovementRule;
import src.rules.WinningRule;
import src.rules.StartingRule;

import java.util.List;

public class Game {
    private final Board board;
    private final List<Player> players;
    private final Dice dice;
    private final StartingRule startingRule;
    private final WinningRule winningRule;
    private final MovementRule movementRule;
    private int currentPlayerIndex;

    Game(Board board, List<Player> players, Dice dice, StartingRule startingRule, WinningRule winningRule, MovementRule movementRule) {
        this.board = board;
        this.players = players;
        this.dice = dice;
        this.startingRule = startingRule;
        this.winningRule = winningRule;
        this.movementRule = movementRule;
        this.currentPlayerIndex = 0;
    }

    public void start() {
        System.out.println("🎲 Snake and Ladder Game Started!");
        System.out.println("Players: " + getPlayerNames());
        System.out.println();

        boolean gameWon = false;
        while (!gameWon) {
            Player currentPlayer = players.get(currentPlayerIndex);

            if (startingRule.canPlayerStart(currentPlayer, dice)) {
                playTurn(currentPlayer);

                if (winningRule.hasWon(currentPlayer, board)) {
                    System.out.println("\n🎉 " + currentPlayer.getName() + " WINS! 🎉");
                    gameWon = true;
                } else {
                    nextPlayer();
                }
            } else {
                System.out.println(currentPlayer.getName() + " cannot start yet!");
                nextPlayer();
            }
        }
    }

    private void playTurn(Player player) {
        System.out.println("\n--- " + player.getName() + "'s Turn (Position: " + player.getPosition() + ") ---");
        player.takeTurn();

        int roll = dice.roll();
        System.out.println("🎲 " + player.getName() + " rolled: " + roll);

        movementRule.move(player, roll, board);
    }

    private void nextPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    }

    private String getPlayerNames() {
        return players.stream().map(Player::getName).reduce((a, b) -> a + ", " + b).orElse("");
    }
}