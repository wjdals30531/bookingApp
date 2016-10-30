package com.example.wjm.ba.soccer;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.wjm.ba.R;

//구장의 목록들이 보이게 하는 클래스
public class SoccerFieldList extends Activity {
    RadioButton newjeju,oldjeju,seoGwipo;
    RadioGroup Group;
    //스트링으로 저장된 프리퍼런스를 불러오는것 저장하는거는 InitialSetting 클래스에 있음
    public static int region_code;
    ListView listView1;
    SoccerFieldListAdapter adapter;
    Intent intent;
    Bundle oncre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        oncre=savedInstanceState;
        setContentView(R.layout.activity_soccer_field_list);

        intent = new Intent(getApplicationContext(), SoccerFieldList.class);
        Group = (RadioGroup) findViewById(R.id.RadioGroup);



        // 리스트뷰 객체 참조
        listView1 = (ListView) findViewById(R.id.listView1);

        // 어댑터 객체 생성
        adapter = new SoccerFieldListAdapter(this);// 리스트뷰에 어댑터 설정
        //Resources res = getResources(); 왜있는지 모름
        if(region_code==1){
            Group.check(R.id.newJeju);
            for(int i=0;i<=1;i++){
            adapter.addItem(new SoccerFieldListItem(getStringPreferences("신제주구장" + i),getStringPreferences("신제주번호" + i),getStringPreferences("신제주가격" + i)));
            }
        }
        else if(region_code==2) {
            Group.check(R.id.oldJeju);
            for (int i = 0; i <= 1; i++) {
                adapter.addItem(new SoccerFieldListItem(getStringPreferences("구제주구장"+i)+i, getStringPreferences("구제주번호" + i), getStringPreferences("구제주가격" + i)));
            }
        }
        else if(region_code==3){
            Group.check(R.id.seoGwipo);
            for(int i=0;i<=1;i++){
                adapter.addItem(new SoccerFieldListItem(getStringPreferences("서귀포구장" + i),getStringPreferences("서귀포번호" + i),getStringPreferences("서귀포가격" + i)));
            }
        }
        //라디오 버튼 변경감지
        Group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {


// TODO Auto-generated method stub
                if(checkedId==R.id.newJeju) {
                    region_code = 1;
                }
                else if(checkedId==R.id.oldJeju) {
                    region_code = 2;
                }
                else if(checkedId==R.id.seoGwipo) {
                    region_code = 3;
                }
                else{
            Toast.makeText(getApplicationContext(),
                    "radio btn select plz", Toast.LENGTH_SHORT).show();
        }

        //액티비티 재시작하라고 만든건데 왜 되는지도 모르겠고
        //rectrate만 쓰면 검은화면 되는걸로 봐서는 불안정하기 때문에 유심히 봐야될 코드

        onCreate(oncre);
    }

});



        listView1.setAdapter(adapter);
        // 새로 정의한 리스너로 객체를 만들어 설정

        listView1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                SoccerFieldListItem curItem = (SoccerFieldListItem) adapter.getItem(position);
                String[] curData = curItem.getData();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + curData[1]));
                startActivity(intent);
                return false;
            }
        });
        // 롱클릭 하면 전화로 넘어가는 코드 ---  행복하다

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SoccerFieldListItem curItem = (SoccerFieldListItem) adapter.getItem(position);
                String[] curData = curItem.getData();

                Toast.makeText(getApplicationContext(), "Selected : " + curData[0], Toast.LENGTH_LONG).show();

            }

}
        );
    }

    public String getStringPreferences(String str) {
        SharedPreferences pref = getSharedPreferences(str,0);
        String tempget = pref.getString(str,null);
        return tempget;
    }

    @Override
    protected void onResume() {
        super.onResume();





    }
}

