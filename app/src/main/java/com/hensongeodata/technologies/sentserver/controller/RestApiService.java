package com.hensongeodata.technologies.sentserver.controller;

import io.reactivex.Single;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface RestApiService {

      @Multipart
      @POST("fileUpload.php")
      Single<ResponseBody> onFileUpload(@Part("email") RequestBody mEmail, @Part MultipartBody.Part file);
}
