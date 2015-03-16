package me.natejones.jerseytests.config;

import javax.ws.rs.ApplicationPath;

import me.natejones.jerseytests.TestResource;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(TestResource.class);
	}
}
