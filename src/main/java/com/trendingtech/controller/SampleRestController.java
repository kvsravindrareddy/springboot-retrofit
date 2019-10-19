package com.trendingtech.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trendingtech.inf.RetrofitInterface;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;


@RestController
public class SampleRestController {

	@Autowired
	private RetrofitInterface retrofitInterface;
	
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
