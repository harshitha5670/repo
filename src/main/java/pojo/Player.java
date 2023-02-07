package pojo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private String name;
    private String country;
    private String role;
    @JsonProperty("price-in-crores")
    @JsonAlias("price-in-crores")
    private String priceincrores;

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", role='" + role + '\'' +
                ", price-in-crores='" + priceincrores + '\'' +
                '}';
    }
}
