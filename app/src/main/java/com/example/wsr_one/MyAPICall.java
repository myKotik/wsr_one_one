package com.example.wsr_one;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyAPICall {
    // https://run.mocky.io/v3/   19708171-881c-4d9d-8c15-fd05e3d54392

    @GET("v3/19708171-881c-4d9d-8c15-fd05e3d54392/")
    Call<DataModel> getData();
}
