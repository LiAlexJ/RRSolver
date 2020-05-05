package Model.Pieces;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Position {
    private int x;
    private int y;
}
