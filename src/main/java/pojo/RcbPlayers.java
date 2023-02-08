package pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class RcbPlayers {
    private String name;
    private String location;
    private ArrayList<Player> player;
}
