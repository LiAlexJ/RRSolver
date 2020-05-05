package Model.Pieces;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Token {
    private Color color;
    private TokenShape shape;
    private Position position;
}
