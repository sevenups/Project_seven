package com.example.student.project_seven;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;


public class localActivity extends ActionBarActivity {
    SimpleCursorAdapter adapter;
    String r;
    int b1;
    int b2;
    int b3;
    BookDBHelper helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);

        /*Intent data = this.getIntent();
        r = data.getStringExtra("branch");
        b1 = data.getIntExtra("ant-man",0);
        b2 = data.getIntExtra("avenger",0);
        b3 = data.getIntExtra("kc7",0);

        helper = new BookDBHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();
        ContentValues i = new ContentValues();

        i.put("branch", r);
        i.put("Ant-Man",b1);
        i.put("Avenger",b2);
        i.put("Kc7",b3);
        long new_id = db.insert("book",null,i);

        System.out.println(new_id);
//        SQLiteDatabase Sdb = helper.getReadableDatabase();
//        Cursor cursor = Sdb.rawQuery("SELECT branch,Ant-Man,Avenger,KC7 FROM book",null);
//
//        adapter = new SimpleCursorAdapter(this,android.R.layout.simple_list_item_2,cursor,new String[] {"branch","books"}, new int[] {android.R.id.text1,android.R.id.text2},0);
//
//        ListView lv = (ListView)findViewById(R.id.listView);
//        lv.setAdapter(adapter);


//        TextView show = (TextView) findViewById(R.id.show);
//        show.setText(String)*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Intent data = this.getIntent();
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_local, menu);
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
