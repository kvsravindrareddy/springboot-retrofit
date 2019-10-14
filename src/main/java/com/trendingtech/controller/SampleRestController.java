package com.trendingtech.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trendingtech.inf.RetrofitInterface;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;


@RestController
public class SampleRestController {

	private RetrofitInterface retrofitInterface;
	
	public SampleRestController()
	{
		Retrofit retrofit = new Retrofit.Builder().baseUrl("http://localhost:7001").build();
		retrofitInterface = retrofit.create(RetrofitInterface.class);
	}
	
	@GetMapping(value="/retrofittest")
	public String hello() throws IOException
	{
		Call<ResponseBody> retrofitCall = retrofitInterface.getConsumerService();
        Response<ResponseBody> response = retrofitCall.execute();
		String consumerResponse = response.body().string();
		System.out.println(" consumerResponse : "+consumerResponse);
		return "Hello Retrofit response ";
	}
}