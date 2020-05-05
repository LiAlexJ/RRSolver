import Model.Game;
import Model.GameIO;
import Model.Pieces.Color;
import Model.Pieces.Position;
import Model.Pieces.TokenShape;
import Model.Search.Direction;
import Model.Search.Move;
import Model.Search.Solution;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GameIOTest {

    @Test
    public void testDeserializer() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONObject obj = (JSONObject)(parser.parse(new FileReader("./src/test/java/inputs/001.json")));
        Game g = GameIO.deserializeGame(obj.toJSONString());
        assertEquals(g.getTargetRobot().getColor(), Color.RED);
        assertEquals(g.getTargetRobot().getPosition().getX(), 0);
        assertEquals(g.getTargetRobot().getPosition().getY(), 0);

        assertEquals(g.getTargetToken().getColor(), Color.RED);
        assertEquals(g.getTargetToken().getShape(), TokenShape.STAR);
        assertEquals(g.getTargetToken().getPosition().getX(), 0);
        assertEquals(g.getTargetToken().getPosition().getY(), 5);

        // we can assume all other values were correctly set
    }

    @Test
    public void testSolutionSerializer() throws IOException, ParseException, JSONException {
        JSONParser parser = new JSONParser();
        List<Move> moves = List.of(new Move(Color.RED, new Position(0,0), new Position(0,5), Direction.RIGHT));
        Solution solution = new Solution(1, moves);
        String jsonSolution = GameIO.serializeSolution(solution);
        JSONAssert.assertEquals(jsonSolution,
                ((JSONObject) (parser.parse(new FileReader("./src/test/java/outputs/001Sol.json")))).toJSONString(),
                false);
    }
}
