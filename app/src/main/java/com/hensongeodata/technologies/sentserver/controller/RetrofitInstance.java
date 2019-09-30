package com.hensongeodata.technologies.sentserver.controller;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

      private static Retrofit retrofit = null;

      public static RestApiService getApiService() {

            if (retrofit == null) {

                  retrofit = new Retrofit.Builder()
                          .baseUrl(BASE_URL)
                          .addConverterFactory(GsonConverterFactory.create())
                          .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                          .build();

            }

            return retrofit.create(RestApiService.class);

      }

}
