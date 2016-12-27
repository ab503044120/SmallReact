package me.dahei.smallreact.app.main;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import net.wequick.small.Small;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnJump:
                        startActivity(new Intent(MainActivity.this, MyReactActivity.class));
                        break;
                    case R.id.btnJumpOrder:
                        startActivity(new Intent(MainActivity.this, OrderReactActivity.class));
                        break;
                    case R.id.btnJumpProduct:
//                        startActivity(new Intent(MainActivity.this, ProductReactActivity.class));
                        Small.openUri("product", MainActivity.this);
                        break;
                }
            }
        };

        findViewById(R.id.btnJump).setOnClickListener(onClickListener);
        findViewById(R.id.btnJumpOrder).setOnClickListener(onClickListener);
        findViewById(R.id.btnJumpProduct).setOnClickListener(onClickListener);

    }
}
