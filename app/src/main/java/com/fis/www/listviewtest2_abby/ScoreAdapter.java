package com.fis.www.listviewtest2_abby;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by f103082 on 2015/4/21.
 */
//需使用繼承及複寫

public class ScoreAdapter extends BaseAdapter  {
    List<StudentScore> scores = StudentScore.GetScore() ;
    @Override
    public int getCount(){
       return scores.size();
    }

    @Override
    //getView 因為為客置的，所以需要另外複寫，才可以套用layout
    public View getView(int index, View layout, ViewGroup viewGroup ){
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext() );//知道從哪個背景上動作
        if(layout ==null)
        {
            layout = inflater.inflate(R.layout.listitem , viewGroup, false); //告訴layout的resource 在什麼地方
        }
        TextView tvName=(TextView)layout.findViewById(R.id.tvName); //load 資料後 直接findViewByID
        TextView tvScore= (TextView)layout.findViewById(R.id.tvScore);
        tvName.setText(scores.get(index).getName() );
        tvScore.setText(String.valueOf(scores.get(index).getScore()));//因為為int 所以需要變成字串 才可顯示
        return layout;

    }
    @Override
    public long getItemId(int index){
        return index;

    }
    @Override
    public StudentScore getItem(int index){
        return scores.get(index);
    }

}
