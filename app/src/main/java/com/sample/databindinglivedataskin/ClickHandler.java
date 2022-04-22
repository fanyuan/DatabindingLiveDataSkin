package com.sample.databindinglivedataskin;

import android.util.Log;

public class ClickHandler {
    private static final String TAG = "ClickHandler";

    /**
     * 两次点击按钮之间的点击间隔不能少于1000毫秒
     */
    private static final int MIN_CLICK_DELAY_TIME = 500;
    private static long lastClickTime;

    /**
     * 防重复点击
     * @return
     */
    public static boolean isFastClick() {
        boolean flag = false;
        long curClickTime = System.currentTimeMillis();
        if ((curClickTime - lastClickTime) < MIN_CLICK_DELAY_TIME) {
            flag = true;
        }
        lastClickTime = curClickTime;
        return flag;
    }

    public static void click(){
        if(isFastClick()){
            Log.d(TAG,"不能重复点击");
            return;
        }
        Log.d(TAG,"ClickHandler   click");
    }
}
