package com.example.bupt.util;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2018/4/11/011.
 */

public class ActivityCollector {
    public static List<Activity> activities=new ArrayList<Activity>();
    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    public static void finishAll(){
        for(Activity activity :activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
