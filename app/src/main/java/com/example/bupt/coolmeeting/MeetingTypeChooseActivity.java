package com.example.bupt.coolmeeting;

import android.content.Context;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MeetingTypeChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meeting_type_choose);
    }
    public static void actionStart(Context context, String data){
        Intent intent=new Intent(context,MeetingTypeChooseActivity.class);
        intent.putExtra("param",data);
        context.startActivity(intent);
    }
}
