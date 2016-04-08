package com.example.android.asynctaskandhandler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnstart;
    MyAsyntask task;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnstart=(Button) findViewById(R.id.btnstart);
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doStart();
            }
        });

    }
    public void doStart()
    {
        String s=((EditText)
                this.findViewById(R.id.editnumber))
                .getText().toString();
        //lấy số lượng từ EditText
        int n=Integer.parseInt(s);
        task=new MyAsyntask(this);
        task.execute(n);
    }
}
