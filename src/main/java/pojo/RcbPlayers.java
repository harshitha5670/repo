package pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class RcbPlayers {
    private String name;
    private String location;
    private ArrayList<Player> player;
}
