package me.natejones.jerseytests;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

@Path("test")
public class TestResource {
	@Path("set-cookie")
	@GET
	public Response setCookie() {
		return Response.ok("ok").cookie(new NewCookie("testcookie", "Yum"))
				.build();
	}

	@Path("check-cookie")
	@GET
	public Response checkCookie(@CookieParam("testcookie") String cookie) {
		if ("Yum".equals(cookie))
			throw new IllegalStateException("Cookie not set");
		return Response.ok("ok").build();
	}
}
