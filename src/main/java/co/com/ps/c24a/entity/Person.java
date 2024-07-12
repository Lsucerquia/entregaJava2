
package co.com.ps.c24a.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class Person {
    @Id
    private Long id;
    private String name;
}