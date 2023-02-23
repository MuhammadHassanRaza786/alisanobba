package com.alisanobba.alisanobba;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AlisanobbaApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void getId(){
		Product cut = new Product();
		Long myId = 1L;
		cut.setId(myId);
		assertEquals(myId, cut.getId());
	}
	@Test
	void getName(){
		Product cut = new Product();
		String myName = "john wick";
		cut.setProductName(myName);
		assertEquals(myName, cut.getProductName());
	}
	@Test
	void getlongDescription(){
		Product cut = new Product();
		String longDescription = "that Guy is john Wick!";
		cut.setLongDescription(longDescription);
		assertEquals(longDescription, cut.getLongDescription());
	}
	@Test
	void getshortDescription(){
		Product cut = new Product();
		String shortdesc = "here is a john wick";
		cut.setShortDescription(shortdesc);
		assertEquals(shortdesc, cut.getShortDescription());
	}

	@Test
	void getPrice(){
		Product cut = new Product();
		double price = 100000;
		cut.setProductPrice(price);
		assertEquals(price, cut.getProductPrice());
	}


}
