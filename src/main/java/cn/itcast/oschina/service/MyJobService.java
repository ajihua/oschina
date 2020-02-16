package cn.itcast.oschina.service;

import android.content.Intent;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;

public class MyJobService extends JobIntentService {
    @Override
    protected void onHandleWork(@NonNull Intent intent) {
        Log.d("lzy","start job service");
    }
}
