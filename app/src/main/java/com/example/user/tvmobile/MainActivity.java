package com.example.user.tvmobile;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void initializeDraggablePanel() throws Resources.NotFoundException {
        draggablePanel.setFragmentManager(getSupportFragmentManager());
        draggablePanel.setTopFragment(placeFragment);
        draggablePanel.setBottomFragment(mapFragment);
        draggablePanel.initializeView();
    }

}
