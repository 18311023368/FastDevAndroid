package com.example.retrofitmodule.api;

import com.example.retrofitmodule.responBean.ImageBean;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by 18311 on 2017/12/28.
 */

public interface Zhuangbi {
    @GET("search")
    Observable<List<ImageBean>> search(@Query("q") String query);

}
