package Model.Search;

import Model.Pieces.Color;
import Model.Pieces.Position;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Move {
    @NonNull private Color color;
    @NonNull private Position initPos;
    @NonNull private Position newPos;
    @NonNull private Direction direction;
}
