package me.dahei.smallreact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import net.wequick.small.Small;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Small.setUp(MainActivity.this, new net.wequick.small.Small.OnCompleteListener() {
            @Override
            public void onComplete() {
                Small.openUri("main", MainActivity.this);
                finish();
                overridePendingTransition(0, 0);

            }
        });
    }
}
