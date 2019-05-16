package com.lthergo.studentsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


import com.lthergo.studentsystem.StudentADB.StudentDao;
import com.lthergo.studentsystem.StudentADB.StudentInfo;

import java.util.Map;

public class resviewActive extends AppCompatActivity {

    private StudentDao dao;
    private ListView lv;
    private String qurey;
    private String arg;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resview);

        Intent intent = getIntent();
        qurey = intent.getStringExtra("query");
        arg = intent.getStringExtra("arg");
        lv = (ListView) findViewById(R.id.lv);
        dao = new StudentDao(this);
        lv.setAdapter(new resviewActive.MyAdapter2());
        
    }



    private class MyAdapter2 extends BaseAdapter {
        // @Override
        public int getCount() {
            return dao.getSomeTotalCount(qurey,arg);
        }
        //@Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            View view = View.inflate(resviewActive.this,R.layout.item_2,null);
            TextView tv_item_id = view.findViewById(R.id.tv_item_id_2);
            TextView tv_item_age = view.findViewById(R.id.tv_item_age_2);
            TextView tv_item_name = view.findViewById(R.id.tv_item_name_2);
            TextView tv_item_phone = view.findViewById(R.id.tv_item_phone_2);
            final Map<String, String> map = dao.qurey(position,qurey,arg);
            tv_item_id.setText(String.valueOf(map.get("studentid")));
            tv_item_name.setText(map.get("name"));
            tv_item_age.setText(map.get("age"));
            tv_item_phone.setText(map.get("cj"));

            return view;
        }

        @Override
        public StudentInfo getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }
    }
}
