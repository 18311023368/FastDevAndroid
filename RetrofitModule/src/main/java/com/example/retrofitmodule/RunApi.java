package com.example.retrofitmodule;

import com.example.retrofitmodule.responBean.ImageBean;

import java.util.List;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by 18311 on 2017/12/28.
 * 测试接口是否返回正确
 */

public class RunApi {


    public static void main(String[] args) {
        testImage();
    }
    //测试基本的rxjava操作
    public static void  testImage(){

        RequestApi.getZhuangbiApi().search("可爱").subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new Consumer<List<ImageBean>>() {
            @Override
            public void accept(@NonNull List<ImageBean> imageBeen) throws Exception {
                System.out.println("反馈：" + imageBeen.size());
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(@NonNull Throwable throwable) throws Exception {
                System.out.println("失败");

            }
        });
    }
}
