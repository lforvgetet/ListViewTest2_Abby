package com.fis.www.listviewtest2_abby;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    ListView ListView;  //第二版
    //第一版
    //ListView ListData;
    //String[] dataArray={"Taipei","HK","Paris","NY"};
    ////資料由Adapter 進入
    //ArrayAdapter ListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScoreAdapter adapter = new ScoreAdapter();
        ListView scoreList=(ListView)findViewById(R.id.ListView );
        scoreList.setAdapter(adapter);
        //ListData =(ListView)findViewById(R.id.ListData );
        //第一版
        //ListAdapter =new ArrayAdapter(MainActivity.this, android.R.layout.simple_expandable_list_item_1,dataArray);
        ////ListView 可以套用公版或是客製
        //ListData.setAdapter(ListAdapter);

        //ListData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          //  @Override
           // public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             //   Toast t = Toast.makeText(MainActivity.this,"Item:" + dataArray[position],Toast.LENGTH_LONG );
             //   t.show();
           // }
        //});




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
