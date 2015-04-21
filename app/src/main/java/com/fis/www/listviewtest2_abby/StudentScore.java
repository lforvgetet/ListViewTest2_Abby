package com.fis.www.listviewtest2_abby;

import android.support.v4.app.INotificationSideChannel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by f103082 on 2015/4/21.
 * Creater :Abby
 * Use Java 建構子
 */
public class StudentScore {
    String name;
    int score;

    public StudentScore( String name, int score) {
        //會藉由建構子傳入score 跟 name 物件
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
    public static List<StudentScore> GetScore(){

        List<StudentScore> scores= new ArrayList<StudentScore>();
        scores.add(new StudentScore("Bread",100));
        scores.add(new StudentScore("Kid King",80));
        return scores;

    }
}
