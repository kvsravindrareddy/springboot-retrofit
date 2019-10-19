package com.trendingtech.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.trendingtech.inf.RetrofitInterface;

import retrofit2.Retrofit;

@Configuration
public class RetrofitConfig {

	@Value("${app.baseurl}")
	private String baseUrl;

	@Bean
	public RetrofitInterface retrofit() {
		Retrofit retrofit = new Retrofit.Builder().baseUrl("http://localhost:7001").build();
		return retrofit.create(RetrofitInterface.class);
	}

}
