import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.java.Log;
import org.testng.annotations.Test;
import pojo.Player;
import pojo.RcbPlayers;
import java.io.File;



@Log
public class Runner {

    @Test
    public void validateRCBPlayers() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        RcbPlayers players = mapper.readValue(new File(System.getProperty("user.dir") + "\\src\\main\\RcbPlayers.json"), RcbPlayers.class);
        int count = 0;
        int wkCount = 0;
        for(Player e : players.getPlayer()) {
            if(!e.getCountry().equalsIgnoreCase("India")) {
                count++;
            }
            if(e.getRole().contains("Wicket-keeper")) {
                wkCount++;
            }
        }
        if(count == 4) {
             log.info ("RCB team has "+count+" players");
        }
        if(wkCount >= 1) {
            log.info("RCB team have atleast one wicket keeper");
        }
    }


}
