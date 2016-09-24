package com.example.wjm.ba.soccer;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.wjm.ba.R;
//구장의 목록들이 보이게 하는 클래스
public class SoccerFieldList extends AppCompatActivity {

    ListView listView1;
    SoccerFieldListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soccer_field_list);  ///<---------이게 메인으로 되어있언 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
                                                                    //방금 잘못 지운거부터 찾는거 시작해신디ㅋㅋ 한참전에 잘못지운거연

        // 리스트뷰 객체 참조
        listView1 = (ListView) findViewById(R.id.listView1);

        // 어댑터 객체 생성
        adapter = new SoccerFieldListAdapter(this);// 리스트뷰에 어댑터 설정

        Resources res = getResources();
        adapter.addItem(new SoccerFieldListItem("추억의 테트리스", "30,000 다운로드", "900 원"));



        listView1.setAdapter(adapter);
        // 새로 정의한 리스너로 객체를 만들어 설정
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SoccerFieldListItem curItem = (SoccerFieldListItem) adapter.getItem(position);
                String[] curData = curItem.getData();

                Toast.makeText(getApplicationContext(), "Selected : " + curData[0], Toast.LENGTH_LONG).show();

            }

        });

    }
    }

