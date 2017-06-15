package com.gods.y.groupon.util;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.gods.y.groupon.config.Constant;

/**
 * 对偏好设置文件的操作
 *
 * 1）Context的getSharedPreferences("文件名",模式) 模式推荐 Context.MODE_PRIVATE
 * 2）Activity的getPreferences(模式)；文件名为 preferences_activity名
 * 3）PreferenceManager的getDefaultSharedPreferences(context);
 *    文件名为 preference_包名
 *    模式为 Context.MODE_PRIVATE
 *
 *
 * Created by y on 2017/6/15 0015.
 */
public class SharedPreferencesUtil {
    //通过构造器的重载，以不同方式获得偏好设置
    SharedPreferences sp;

    public SharedPreferencesUtil(Context context,String fileName) {
        sp = context.getSharedPreferences(fileName,Context.MODE_PRIVATE);
    }

    public SharedPreferencesUtil(Context context) {
        sp = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public boolean isFirst() {
        return sp.getBoolean(Constant.FIRST,true);
    }

    public void setFirst(boolean flag){
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean(Constant.FIRST,flag);
        editor.commit();

    }
}
