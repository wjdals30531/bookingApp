package com.example.wjm.ba;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by wjm on 2016-09-28.
 */
public class asd extends Activity{
    public void saveStringPreferences(String str,String str2) {
        SharedPreferences pref = getSharedPreferences(str, 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(str, str2);
        editor.commit();
    }


    public void savedata(){
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


    }
}
