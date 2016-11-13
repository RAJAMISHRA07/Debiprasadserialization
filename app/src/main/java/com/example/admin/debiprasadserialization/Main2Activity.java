package com.example.admin.debiprasadserialization;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import Student.Student;

public class Main2Activity extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv= (TextView) findViewById(R.id.textView);
        Intent in=getIntent();
        //GET BUNDLE
        Bundle bundle=in.getBundleExtra("myobject");
        //NOW WE GET SERIALIZABLE OBJECT
         Student s=(Student)bundle.getSerializable("stud");
        //NOW WE CAN READ STUDENT VALUES AND APPLY ON TEXTVIEW
        tv.setText(s.sno+"\n"+s.sname+"\n"+s.scourse+"\n");

        }

    }
