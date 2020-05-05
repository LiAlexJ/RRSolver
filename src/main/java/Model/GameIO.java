package Model;

import Model.Search.Solution;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GameIO {
    private GameIO(){
        //no-op
    }

    public static Game deserializeGame(String game) throws JsonProcessingException {
        return new ObjectMapper().readValue(game, Game.class);
    }

    public static String serializeSolution(Solution solution) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(solution);
    }
}
