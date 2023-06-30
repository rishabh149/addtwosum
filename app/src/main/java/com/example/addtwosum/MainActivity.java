package com.example.addtwosum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView Tv;
    private EditText e1;
    private EditText e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.b2);
      Tv = findViewById(R.id.ans);
      e1 = findViewById(R.id.edit1);
      e2 = findViewById(R.id.edit2);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String s1=e1.getText().toString();
//                String s2=e2.getText().toString();
//                int a=Integer.parseInt(s1);
//                int b=Integer.parseInt(s2);
//                Tv.setText("SUM IS : "+(a+b));
//            }
//        });
    }
    public void Sum(View view)
    {
     int a=Integer.parseInt(e1.getText().toString());
     int b=Integer.parseInt(e2.getText().toString());
     Tv.setText("SUM id :"+(a+b));
    }
}