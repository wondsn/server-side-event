package hello.kgs.sseapp;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

@Slf4j
@Component
@RequiredArgsConstructor
public class SignUpScheduler {

    private final UserService userService;

    private final Random random = new Random();

    @Scheduled(fixedDelay = 2000)
    public void signUpTask() {
        userService.signUp(User.createUser("redrum", random.nextInt(30)));
    }
}
