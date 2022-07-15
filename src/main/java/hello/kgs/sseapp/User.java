package hello.kgs.sseapp;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class User {
    private String name;
    private Integer age;

    public static User createUser(String name, Integer age) {
        return new User(name, age);
    }
}
