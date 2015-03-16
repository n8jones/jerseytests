package me.natejones.jerseytests;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.junit.Test;

public class JerseyIT {
	@Test
	public void test_cookies() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:9090/jerseytests/api");
		assertEquals("Set cookie", "ok", target.path("test/set-cookie").request()
				.get(String.class));
		assertEquals("Set cookie", "ok", target.path("test/check-cookie")
				.request().get(String.class));
	}
}
