package com.sbmobilerepairapp;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sbmobilerepairapp.controller.ShopController;
import com.sbmobilerepairapp.entity.Shops;

@SpringBootTest
class SbMobileRepairAppApplicationTests {

	@Autowired
	private ShopController controller;

	@Test
	void getAllShopsPositive() {

		List<Shops> shops = controller.getAllShops();

		assertThat(shops).isNotEmpty();

	}
	
	@Disabled
	@Test
	void getAllShopsNegative() {

		List<Shops> shops = controller.getAllShops();

		assertThat(shops).isNullOrEmpty();

	}

}
