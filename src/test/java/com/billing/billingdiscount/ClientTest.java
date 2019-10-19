package com.billing.billingdiscount;

import org.junit.Assert;
import org.junit.Test;

import com.billing.billingdiscount.entity.Client;

public class ClientTest {

	@Test
	public void testLoyaltyClient() {
		Client client = DataInitializer.getLoyaltyClient();
		Assert.assertTrue(client.isLoyalClient());
	}

	@Test
	public void testNonLoyaltyClient() {
		Client client = DataInitializer.getNonLoyaltyClient();
		Assert.assertFalse(client.isLoyalClient());
	}

	@Test
	public void testClientType() {
		Client client = DataInitializer.getEmployeeClient();
		Assert.assertFalse(client.isLoyalClient());
	}

}
