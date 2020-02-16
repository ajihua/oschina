package cn.itcast.oschina.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.thoughtworks.xstream.XStream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import cn.itcast.oschina.R;
import cn.itcast.oschina.bean.DemoBean;
import cn.itcast.oschina.service.MyJobService;

public class MainActivity extends AppCompatActivity {

    String xml = "<root><resultcode>200</resultcode><reason>success</reason><result><item><id>242</id><catalog>中国文学</catalog> </item><item><id>113</id><catalog>java</catalog> </item><item><id>001</id><catalog>android</catalog> </item></result></root>";
    @BindView(R.id.tb_main)
    Toolbar toolbar;
    @BindView(R.id.tv_textView)
    TextView tvTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary));
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        Log.d("lzy","lzy");
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);


        Intent work = new Intent();
        MyJobService.enqueueWork(this, MyJobService.class, 123, work);


        XStream stream = new XStream();
        stream.processAnnotations(DemoBean.class);
        DemoBean bean = (DemoBean) stream.fromXML(xml);

        Log.d("lzy", "code=" + bean.resultcode);
        Log.d("lzy", "catalog=" + bean.result.item.get(0).catalog);
        Toast.makeText(this, "s" + bean.result.item.get(0).catalog, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
