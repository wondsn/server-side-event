package hello.kgs.sseapp;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final ApplicationEventPublisher publisher;

    public void signUp(final User user) {
        /**
         * 중요한 비지니스 로직..
         */
        publisher.publishEvent(new SignupEvent(user));
    }
}
