package me.scientists309.customfontstutorial;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.textView3);
        tv2=(TextView)findViewById(R.id.textView4);

        Typeface face= Typeface.createFromAsset(getAssets(), "fonts/waltographUI.ttf");
        tv1.setTypeface(face);

        Typeface face1= Typeface.createFromAsset(getAssets(), "fonts/waltographUI.ttf");
        tv2.setTypeface(face1);
    }
}
