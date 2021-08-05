package com.poc.nosqlstudentexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.oracle.nosql.spring.data.config.AbstractNosqlConfiguration;
import com.oracle.nosql.spring.data.config.NosqlDbConfig;
import com.oracle.nosql.spring.data.repository.config.EnableNosqlRepositories;

import oracle.nosql.driver.AuthorizationProvider;
import oracle.nosql.driver.kv.StoreAccessTokenProvider;

/*The @Configuration annotation specifies that this class can be 
  used by the Spring Data Framework as a source of bean definitions.*/
//annotation to enable NoSQL repositories.
@Configuration
@EnableNosqlRepositories
public class AppConfig extends AbstractNosqlConfiguration {

	/*
	 * Annotation to tell the Spring Data Framework that the returned object should
	 * be registered as a bean in the Spring application.
	 */
	@Bean
	public NosqlDbConfig nosqlDbConfig() {
		AuthorizationProvider authorizationProvider;
		authorizationProvider = new StoreAccessTokenProvider();
		// Provide the host name and port number of the NoSQL cluster.
		return new NosqlDbConfig("http://localhost:8087", authorizationProvider);
	}
}