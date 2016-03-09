package cz.johrusk.udacitybegginerproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static android.content.Intent.ACTION_VIEW;

public class MainActivity extends AppCompatActivity {

    private int factsSet = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //* Open original webpage, where you can find more stuff.
    public void sourceWebsite(View view) {
        String url = "http://www.androidauthority.com/google-play-store-apple-app-store-downloads-673499/";
        Intent intent = new Intent(ACTION_VIEW, Uri.parse(url));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    //It will replace default texts and pictures,
    //if it's already replaced it will show you default stuff instead
    public void changeText(View view) {

        TextView tv1 = (TextView) findViewById(R.id.textView1);
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        TextView tv3 = (TextView) findViewById(R.id.textView3);
        TextView tv4 = (TextView) findViewById(R.id.textView4);
        TextView tv5 = (TextView) findViewById(R.id.textView5);

        TextView tv01 = (TextView) findViewById(R.id.textView01);
        TextView tv02 = (TextView) findViewById(R.id.textView02);
        TextView tv03 = (TextView) findViewById(R.id.textView03);
        TextView tv04 = (TextView) findViewById(R.id.textView04);
        TextView tv05 = (TextView) findViewById(R.id.textView05);

        ImageView iv1 = (ImageView) findViewById(R.id.imageView1);
        ImageView iv2 = (ImageView) findViewById(R.id.imageView2);
        ImageView iv3 = (ImageView) findViewById(R.id.imageView3);
        ImageView iv4 = (ImageView) findViewById(R.id.imageView4);
        ImageView iv5 = (ImageView) findViewById(R.id.imageView5);

        //Original set of facts is showed
        if (factsSet == 0) {
            factsSet = 1;

            iv1.setImageResource(R.drawable.razrhd);
            iv2.setImageResource(R.drawable.pager);
            iv3.setImageResource(R.drawable.galvincorp);
            iv4.setImageResource(R.drawable.ideni1000);
            iv5.setImageResource(R.drawable.logo);

            tv01.setText(R.string.Fact6);
            tv02.setText(R.string.Fact7);
            tv03.setText(R.string.Fact8);
            tv04.setText(R.string.Fact9);
            tv05.setText(R.string.Fact10);

            tv1.setText(R.string.Fact6long);
            tv2.setText(R.string.Fact7long);
            tv3.setText(R.string.Fact8long);
            tv4.setText(R.string.Fact9long);
            tv5.setText(R.string.Fact10long);
        }

        //Topics are already changed
        else {
            factsSet = 0;

            iv1.setImageResource(R.drawable.radio_car);
            iv2.setImageResource(R.drawable.walkietalkie);
            iv3.setImageResource(R.drawable.phoneguy);
            iv4.setImageResource(R.drawable.moon);
            iv5.setImageResource(R.drawable.lenovo);

            tv01.setText(R.string.Fact1);
            tv02.setText(R.string.Fact2);
            tv03.setText(R.string.Fact3);
            tv04.setText(R.string.Fact4);
            tv05.setText(R.string.Fact5);

            tv1.setText(R.string.Fact1long);
            tv2.setText(R.string.Fact2long);
            tv3.setText(R.string.Fact3long);
            tv4.setText(R.string.Fact4long);
            tv5.setText(R.string.Fact5long);
        }
    }
}

