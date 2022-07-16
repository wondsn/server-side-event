package hello.kgs.sseapp.stock;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UpdatePriceEvent {
    private String stock;
    private Integer updatePrice;
}
