package hello.kgs.sseapp.stock;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StockService {

    private final Map<String, Integer> stock;
    private final ApplicationEventPublisher publisher;

    @PostConstruct
    public void stockInitializer() {
        stock.put("삼성전자", 70000);
        stock.put("테슬라", 200000);
        stock.put("애플", 100000);
    }

    public void updateCurrentPrice(String stockName, Integer volatility) {
        Integer currentPrice = stock.get(stockName);
        currentPrice += volatility;
        stock.put(stockName, currentPrice);
        publisher.publishEvent(new UpdatePriceEvent(stockName, currentPrice));
    }

}
