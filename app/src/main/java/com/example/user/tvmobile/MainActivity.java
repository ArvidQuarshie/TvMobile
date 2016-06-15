package com.example.user.tvmobile;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

/**
 * Created by geckozila on 15/06/16.
 */
public class MainActivity extends AppCompatActivity {

    ImageView image;
    private static final String Tag = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image =(ImageView) findViewById(R.id.iv_fan_art);
        String imageUri = "https://unsplash.com/photos/1CsfTx0DuLs";
        Picasso picasso = new Picasso.Builder(this).listener(new Picasso.Listener(){
            @Override
            public void onImageLoadFailed(Picasso picasso, Uri uri, Exception exception) {
                exception.printStackTrace();
        }

        }).build();
        picasso.load(imageUri).into(image, new Callback() {
            @Override
            public void onSuccess() {
                Log.d(Tag, "Success");
            }

            @Override
            public void onError() {
                Log.d(Tag , "Error");

            }
        });
    }
}
