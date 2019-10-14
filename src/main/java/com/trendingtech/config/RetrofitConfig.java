/*package com.trendingtech.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.trendingtech.inf.RetrofitInterface;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {

	@Value("${app.baseurl}")
	private String baseUrl;

	@Bean
	public RetrofitInterface retrofit() {
		OkHttpClient httpClient = new OkHttpClient();
		Retrofit retrofit = new Retrofit.Builder().baseUrl(baseUrl)
				.addConverterFactory(GsonConverterFactory.create()).client(httpClient).build();
		RetrofitInterface retrofitInterface = retrofit.create(RetrofitInterface.class);
		return retrofitInterface;
	}

}*/