
package esb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class WarehouseActivator {

	@Autowired
	RestTemplate restTemplate;

	public Order checkStock(Order order) {
		System.out.println("WarehouseService: checking order " + order.toString());
		if (order.getOrderType().equals("international")) {
			restTemplate.postForLocation("http://localhost:8084/orders", order);
		} else {
			if (order.getAmount() > 175) {
				restTemplate.postForLocation("http://localhost:8082/orders", order);
			} else {
				restTemplate.postForLocation("http://localhost:8083/orders", order);
			}
		}

		return order;
	}
}
