package utilities;

import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.RcbPlayers;
import java.io.File;

public class ReadJson {
    public RcbPlayers readRcbJsonValue() throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        RcbPlayers players = mapper.readValue(new File(System.getProperty("user.dir") + "\\src\\main\\resources\\RcbPlayers.json"),
                RcbPlayers.class);
        return players;
    }
}
