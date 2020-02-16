
package cn.itcast.oschina.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.thoughtworks.xstream.XStream;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.itcast.oschina.R;
import cn.itcast.oschina.bean.DemoBean;
import cn.itcast.oschina.service.MyJobService;

public class SplashActivity extends Activity {


    Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);

        handler.postDelayed(()->{
            startActivity(new Intent(this,MainActivity.class));
            finish();
        },400);
    }


}
