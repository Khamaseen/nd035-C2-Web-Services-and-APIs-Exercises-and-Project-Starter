package com.udacity.pricing;

import com.udacity.pricing.domain.price.Price;
import com.udacity.pricing.repository.PriceRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PricingServiceImplApplicationTests {

	@Autowired
	private PriceRepository priceRepository;

	@Test
	public void getPriceForVehicle() {
		Long vehicleId = 1L;
		Price price = this.priceRepository.findById(vehicleId).get();

		Assertions.assertNotNull(price);
		Assertions.assertTrue(price.getVehicleId().equals(vehicleId));
	}

}
