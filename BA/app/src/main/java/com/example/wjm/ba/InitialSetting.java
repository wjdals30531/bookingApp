package com.example.wjm.ba;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
//앱이 깔리거나 업데이트되면 데이타들을 저장하는 서비스,아직 동작 안함
public class InitialSetting extends Service {

    public void saveStringPreferences(String str,String str2){
        SharedPreferences pref = getSharedPreferences(str,0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(str,str2);
        editor.commit();
    }
    public InitialSetting() {
        saveStringPreferences("신제주 A구장","신제주구장"+0);
        saveStringPreferences("1234567","신제주번호"+0);
        saveStringPreferences("신제주 A구장가격","신제주가격"+0);


        saveStringPreferences("신제주 B구장","신제주구장"+1);
        saveStringPreferences("신제주 B구장 번호","신제주번호"+1);
        saveStringPreferences("신제주 B구장가격","신제주가격"+1);

        saveStringPreferences("구제주 A구장","구제주구장"+0);
        saveStringPreferences("구제주 A구장 번호","구제주번호"+0);
        saveStringPreferences("구제주 A구장가격","구제주가격"+0);

        saveStringPreferences("구제주 B구장","구제주구장"+1);
        saveStringPreferences("구제주 B구장 뭐였드라","구제주번호"+1);
        saveStringPreferences("구제주 B구장가격","구제주가격"+1);

        saveStringPreferences("서귀포 A구장","서귀포구장"+0);
        saveStringPreferences("서귀포 A구장 뭐였드라","서귀포번호"+0);
        saveStringPreferences("서귀포 A구장가격","서귀포가격"+0);

        saveStringPreferences("서귀포 B구장","서귀포"+1);
        saveStringPreferences("서귀포 B구장 뭐였지","서귀포번호"+1);
        saveStringPreferences("서귀포 B구장가격","서귀포가격"+1);

        Intent i = new Intent(getApplicationContext(),InitialSetting.class);
        stopService(i);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
