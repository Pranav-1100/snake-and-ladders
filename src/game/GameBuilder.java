package src.game;

import src.board.Board;
import src.player.Player;
import src.rules.MovementRule;
import src.rules.WinningRule;
import src.rules.StartingRule;

import java.util.ArrayList;
import java.util.List;

public class GameBuilder {
    private Board board;
    private List<Player> players = new ArrayList<>();
    private Dice dice;
    private StartingRule startingRule;
    private WinningRule winningRule;
    private MovementRule movementRule;

    public GameBuilder setBoard(Board board) {
        this.board = board;
        return this;
    }

    public GameBuilder addPlayer(Player player) {
        this.players.add(player);
        return this;
    }

    public GameBuilder addPlayers(List<Player> players) {
        this.players.addAll(players);
        return this;
    }

    public GameBuilder setDice(Dice dice) {
        this.dice = dice;
        return this;
    }

    public GameBuilder setWinningRule(WinningRule rule) {
        this.winningRule = rule;
        return this;
    }

    public GameBuilder setStartingRule(StartingRule rule) {
        this.startingRule = rule;
        return this;
    }

    public GameBuilder setMovementRule(MovementRule rule) {
        this.movementRule = rule;
        return this;
    }

    public Game build() {
        return new Game(board, players, dice, startingRule, winningRule, movementRule);
    }
}