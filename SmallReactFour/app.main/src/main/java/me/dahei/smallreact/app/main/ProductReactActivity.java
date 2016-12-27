package me.dahei.smallreact.app.main;


import me.dahei.smallreact.app.main.base.BaseReactActivity;

/**
 * Created by su on 2016/12/26.
 */

public class ProductReactActivity extends BaseReactActivity {

    @Override
    public String getMyComponentName() {
        return "HelloOrder";
    }

    @Override
    public String getAssertName() {
        return "index.android.order.bundle";
    }
}