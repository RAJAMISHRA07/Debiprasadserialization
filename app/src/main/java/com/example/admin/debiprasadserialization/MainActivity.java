package com.example.admin.debiprasadserialization;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import Student.Student;

public class MainActivity extends AppCompatActivity {
EditText et1,et2,et3;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1= (EditText) findViewById(R.id.editText);
        et2= (EditText) findViewById(R.id.editText2);
        et3= (EditText) findViewById(R.id.editText3);
        b= (Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //PASS STUDENT OBJECT TO NEXT ACTIVITY
                Intent in=new Intent(MainActivity.this,Main2Activity.class);

                //NOW PREPARE OBJECT
                Student s=new Student();

                //FILL DATA INTO OBJECT
                s.sno=Integer.parseInt(et1.getText().toString());
                s.sname=et2.getText().toString();
                s.scourse=et3.getText().toString();

                //NOW USE PUT SERIALIZABLE METHOD
                Bundle bundle=new Bundle();
                bundle.putSerializable("stud",s);

                //pass bundle to intent
                in.putExtra("myobject",bundle);
                startActivity(in);
                

            }
        });
    }
}
