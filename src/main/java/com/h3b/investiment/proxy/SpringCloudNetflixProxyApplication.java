package com.h3b.investiment.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class SpringCloudNetflixProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudNetflixProxyApplication.class, args);
	}

}
