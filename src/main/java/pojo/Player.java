package pojo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Player {
    private String name;
    private String country;
    private String role;
    @JsonProperty("price-in-crores")
    @JsonAlias("price-in-crores")
    private String priceincrores;
}
