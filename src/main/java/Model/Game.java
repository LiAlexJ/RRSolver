package Model;

import Model.Pieces.Robot;
import Model.Pieces.Token;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Game {
    private Robot targetRobot;
    private List<Robot> robots;
    private int[][] board;
    private Token targetToken;
    private List<Token> tokens;
}
