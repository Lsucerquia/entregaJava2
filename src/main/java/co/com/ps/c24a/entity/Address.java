
package co.com.ps.c24a.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter

public class Address {

    @Id
    private Long id;
    private Long personId;
    private String city;

}