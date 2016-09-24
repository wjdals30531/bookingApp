package com.example.wjm.ba.soccer;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.wjm.ba.R;

/**
 * Created by wjm on 2016-09-23.
 */
//텍스트뷰의 텍스트들을 저장하는것
public class SoccerFieldListView extends LinearLayout{

    /**
     * Icon
     */
    //private ImageView mIcon;

    /**
     * TextView 01
     */
    private TextView mText01;

    /**
     * TextView 02
     */
    private TextView mText02;

    /**
     * TextView 03
     */
    private TextView mText03;

    public SoccerFieldListView(Context context, SoccerFieldListItem aItem) {
        super(context);

        // Layout Inflation
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.activity_soccer_field_listitem, this, true);


        // Set Text 01
        mText01 = (TextView) findViewById(R.id.fieldName);
        mText01.setText(aItem.getData(0));

        // Set Text 02
        mText02 = (TextView) findViewById(R.id.fieldCost);
        mText02.setText(aItem.getData(1));

        // Set Text 03
        mText03 = (TextView) findViewById(R.id.fieldNumber);
        mText03.setText(aItem.getData(2));

    }

    /**
     * set Text
     *
     * @param index
     * @param data
     */
    public void setText(int index, String data) {
        if (index == 0) {
            mText01.setText(data);
        } else if (index == 1) {
            mText02.setText(data);
        } else if (index == 2) {
            mText03.setText(data);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * set Icon
     *
     * @param icon
     */
   /* public void setIcon(Drawable icon) {
        mIcon.setImageDrawable(icon);
    }
    */

}

