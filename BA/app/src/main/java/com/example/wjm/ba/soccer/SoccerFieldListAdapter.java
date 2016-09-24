package com.example.wjm.ba.soccer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wjm on 2016-09-23.
 */

//리스트뷰를 관리 ,추가 할 수 있게하는 클래스(?)
public class SoccerFieldListAdapter extends BaseAdapter{

    private Context mContext;

    private List<SoccerFieldListItem> mItems = new ArrayList<SoccerFieldListItem>();

    public SoccerFieldListAdapter(Context context) {
        mContext = context;
    }

    public void addItem(SoccerFieldListItem it) {
        mItems.add(it);
    }

    public void setListItems(List<SoccerFieldListItem> lit) {
        mItems = lit;
    }

    public int getCount() {
        return mItems.size();
    }

    public Object getItem(int position) {
        return mItems.get(position);
    }

    public boolean areAllItemsSelectable() {
        return false;
    }

    public boolean isSelectable(int position) {
        try {
            return mItems.get(position).isSelectable();
        } catch (IndexOutOfBoundsException ex) {
            return false;
        }
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        SoccerFieldListView itemView;
        if (convertView == null) {
            itemView = new SoccerFieldListView(mContext, mItems.get(position));
        } else {
            itemView = (SoccerFieldListView) convertView;

            itemView.setText(0, mItems.get(position).getData(0));
            itemView.setText(1, mItems.get(position).getData(1));
            itemView.setText(2, mItems.get(position).getData(2));
        }

        return itemView;
    }
}
