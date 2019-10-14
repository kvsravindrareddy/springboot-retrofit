package com.trendingtech.inf;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {
	@GET("/testone")
	public Call<ResponseBody> getConsumerService();
}