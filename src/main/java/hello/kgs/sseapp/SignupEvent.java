package hello.kgs.sseapp;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SignupEvent {
    private User user;
}
