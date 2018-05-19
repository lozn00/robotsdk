package cn.qssq666.robot.plugin.sdk.interfaces;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by qssq on 2018/5/17 qssq666@foxmail.com
 *
 * 用户要写插件的时候可以继承这个类，这样的花，这个成员变量就不需要每次在写了
 */
public  class DebugPluginInterfaceWrapper extends SimplePluginInterfaceWrapper {
    private static final String TAG = "DEBUG_PLUGIN";

    @Override
    public String getAuthorName() {
        return "debug_qssq";
    }

    @Override
    public int getVersionCode() {
        return new Random().nextInt(100);
    }

    @Override
    public String getBuildTime() {
        return "2018-01-01";
    }

    @Override
    public String getVersionName() {
        return "1.0";
    }

    @Override
    public String getPackageName() {
        return "cn.qssq666.debug";
    }

    @Override
    public String getDescript() {
        return "这是描述信息呢";
    }

    @Override
    public String getPluginName() {
        return "调试插件";
    }

    @Override
    public boolean isDisable() {
        return false;
    }

    @Override
    public void setDisable(boolean disable) {
        System.out.println("setDisable");
    }

    @Override
    public void onCreate(Context context) {
        System.out.println("onCreate");
    }

    @Override
    public boolean onReceiveMsgIsNeedIntercept(IMsgModel item) {
        System.out.println("receive msg content :"+item.getMessage()+",nickname:"+item.getNickname()+",qq:"+item.getSenderuin()+",robotqq:"+item.getSelfuin());

        return false;
    }

    @Override
    public boolean onReceiveOtherIntercept(IMsgModel item, int type) {

        System.out.println("onReceiveOtherIntercept item:"+item.toString()+",type:"+type);
        return false;
    }

    @Override
    public void onDestory() {
        System.out.println("onDestory");
    }

    @Override
    public View onConfigUi(ViewGroup viewGroup) {
        TextView textView = new TextView(viewGroup.getContext());
        textView.setText("debug plugin");
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.w(TAG,"debug info print");
            }
        });

        return textView;
    }
}
