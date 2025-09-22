package src;

import src.board.Board;
import src.board.Coordinate;
import src.elements.Ladder;
import src.elements.Snake;
import src.factory.PlayerFactory;
import src.game.Dice;
import src.game.Game;
import src.game.GameBuilder;
import src.player.Player;
import src.strategy.AggressiveStrategy;
import src.strategy.DefensiveStrategy;
import src.rules.ClassicMovementRule;
import src.rules.StandardWinningRule;
import src.rules.AnyNumberStartingRule;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Board board = new Board(100);

        board.addElement(new Snake(new Coordinate(98), new Coordinate(79)));
        board.addElement(new Snake(new Coordinate(87), new Coordinate(24)));
        board.addElement(new Snake(new Coordinate(62), new Coordinate(18)));
        
        board.addElement(new Ladder(new Coordinate(3), new Coordinate(22)));
        board.addElement(new Ladder(new Coordinate(8), new Coordinate(30)));
        board.addElement(new Ladder(new Coordinate(28), new Coordinate(84)));

        Player alice = PlayerFactory.createHumanPlayer("Alice");
        Player botX = PlayerFactory.createBotPlayer("BotX", new AggressiveStrategy());
        Player botY = PlayerFactory.createBotPlayer("BotY", new DefensiveStrategy());

        List<Player> players = Arrays.asList(alice, botX, botY);

        Game game = new GameBuilder()
                .setBoard(board)
                .addPlayers(players)
                .setDice(new Dice(6))
                .setStartingRule(new AnyNumberStartingRule())
                .setWinningRule(new StandardWinningRule())
                .setMovementRule(new ClassicMovementRule())
                .build();

        game.start();
    }
}