package com.example.user.tvmobile;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}
//package com.example.user.tvmobile;

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
        image =(ImageView) findViewById(R.id.img);
        // link of the image
        String imageUri = "http://www.lgg3wallpaper.com/wp-content/uploads/Girl/Girl%20LG%20G3%20Wallpapers%2082.jpg";
        // picasso instance
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
