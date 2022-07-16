package hello.kgs.sseapp.stock;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

@Slf4j
@Component
@RequiredArgsConstructor
public class StockScheduler {

    private final StockService stockService;
    private final Random random = new Random(System.currentTimeMillis());

    @Scheduled(fixedDelay = 1000)
    public void updatePrice() {
        stockService.updateCurrentPrice("삼성전자", createRandomVolatility());
        stockService.updateCurrentPrice("테슬라", createRandomVolatility());
        stockService.updateCurrentPrice("애플", createRandomVolatility());
    }

    private Integer createRandomVolatility() {
        return random.nextInt(20) * 100 - 1000;
    }
}
