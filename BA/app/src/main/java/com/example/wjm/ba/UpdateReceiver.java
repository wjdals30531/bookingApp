package com.example.wjm.ba;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
//앱이 실행되거나 업데이트되면 이니셜셋팅 서비스 시작인데 아직 안되는중
public class UpdateReceiver extends BroadcastReceiver {


    asd save =new asd();
    @Override

    public void onReceive(Context context, Intent intent) {

        String action = intent.getAction();
        Intent i = new Intent(context, InitialSetting.class);
        if (action.equals(Intent.ACTION_PACKAGE_ADDED)) {
            save.savedata();// 앱이 설치되었을 때
        } else if (action.equals(Intent.ACTION_PACKAGE_REPLACED)) {
            // 앱이 업데이트 되었을 때
            save.savedata();

        }
    }
}