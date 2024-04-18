package hello.springmvc.basic;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
//getter,setter를 자동으로 만들어줌.
public class HelloData {
    private String username;
    private int age;
}
