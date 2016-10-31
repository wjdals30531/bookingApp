package com.example.wjm.ba;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.wjm.ba.soccer.SoccerFieldList;
//첫화면
//첫화면 켜짐과 동시에 프리퍼런스를 저장
public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
        //IsUpdated는 업데이트 할때마다 적당한 값으로 false로 변경할것
        //
        private boolean IsUpdated;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        boolean IsUpdated = false;
        if(IsUpdated == false){
            Toast.makeText(getApplicationContext(),"데이터를 불러오고 있습니다.",Toast.LENGTH_SHORT).show();
           savedata();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.soCCer) {
            Intent i = new Intent(getApplicationContext(),SoccerFieldList.class);
            startActivity(i);
        } else if (id == R.id.basKetball) {

        } else if (id == R.id.baSEball) {

        } else if (id == R.id.badMinton) {

        } else if (id == R.id.suGGestion) {

        } else if (id == R.id.doNation) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

//        public String getStringPreferences(String str) {
//	        SharedPreferences pref = getSharedPreferences(str,0);
//	        String tempget = pref.getString(str,null);
//        	return tempget;
//    	}




    public void saveStringPreferences(String str,String str2){
        SharedPreferences pref = getSharedPreferences(str,0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(str,str2);
        editor.commit();
    }
    public void savedata() {
        saveStringPreferences("신제주구장" + 0, "제주제일고등학교");
        saveStringPreferences("신제주번호" + 0, "064-740-8200");
        saveStringPreferences("신제주가격" + 0, "진군길 22");


        saveStringPreferences("신제주구장" + 1, "남녕고등학교");
        saveStringPreferences("신제주번호" + 1, "064-742-1711");
        saveStringPreferences("신제주가격" + 1, "연동 2288");

        saveStringPreferences("신제주구장" + 2, "제주서중학교");
        saveStringPreferences("신제주번호" + 2, "064-747-0394");
        saveStringPreferences("신제주가격" + 2, "일주서로 7811");

        saveStringPreferences("신제주구장" + 3, "제주중앙중학교");
        saveStringPreferences("신제주번호" + 3, "064-743-1965");
        saveStringPreferences("신제주가격" + 3, "선덕로5길 37");


        saveStringPreferences("구제주구장" + 0, "구제주 A구장");
        saveStringPreferences("구제주번호" + 0, "구제주 A구장 번호");
        saveStringPreferences("구제주가격" + 0, "구제주 A구장가격");

        saveStringPreferences("구제주구장" + 1, "구제주 B구장");
        saveStringPreferences("구제주번호" + 1, "구제주 B구장 뭐였드라");
        saveStringPreferences("구제주가격" + 1, "구제주 B구장가격");

        saveStringPreferences("서귀포구장" + 0, "서귀포 A구장");
        saveStringPreferences("서귀포번호" + 0, "서귀포 A구장 뭐였드라");
        saveStringPreferences("서귀포가격" + 0, "서귀포 A구장가격");

        saveStringPreferences("서귀포구장" + 1, "서귀포 B구장");
        saveStringPreferences("서귀포번호" + 1, "서귀포 B구장 뭐였지");
        saveStringPreferences("서귀포가격" + 1, "서귀포 B구장가격");
        IsUpdated = true;
    }







}

