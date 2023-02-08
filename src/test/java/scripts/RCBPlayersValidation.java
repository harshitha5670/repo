package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.Player;
import utilities.ReadJson;

public class RCBPlayersValidation {
    ReadJson readJson = new ReadJson();

    @Test
    public void validateForeignPlayers() throws Exception {
        int count=0;
        for(Player player: readJson.readRcbJsonValue().getPlayer()){
            if(!player.getCountry().equalsIgnoreCase("India")) {
                count++;
            }
        }
        Assert.assertEquals(count,4);
    }

    @Test
    public void validateWicketPlayers() throws Exception{
        int count =0;
        for (Player player : readJson.readRcbJsonValue().getPlayer()) {
            if(player.getRole().contains("Wicket-keeper")) {
                count++;
            }
        }
        if(count >= 1) {
            Assert.assertTrue(true);
        }
        else {
            Assert.fail("There are no wicket-keepers in the team");
        }
    }
}
