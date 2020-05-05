package Model.Search;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Solution {
    private int numMoves;
    @NonNull private List<Move> moves;
}
