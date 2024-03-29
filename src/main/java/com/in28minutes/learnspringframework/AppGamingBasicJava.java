package src.main.java.com.in28minutes.learnspringframework;

import src.main.java.com.in28minutes.learnspringframework.game.GameRunner;
import src.main.java.com.in28minutes.learnspringframework.game.MarioGame;
import src.main.java.com.in28minutes.learnspringframework.game.PacmanGame;
import src.main.java.com.in28minutes.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var pacmanGmae = new PacmanGame();

        var gameRunner1 = new GameRunner(marioGame);
        var gameRunner2 = new GameRunner(superContraGame);
        var gameRunner3 = new GameRunner(pacmanGmae);
        gameRunner1.run();
        gameRunner2.run();
        gameRunner3.run();

    }
}
