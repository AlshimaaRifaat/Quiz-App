package com.example.shosho.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    int Result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button) findViewById(R.id.Result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getResults();
                Toast.makeText(getApplicationContext()," Your score is "+ Result,Toast.LENGTH_LONG).show();
                Result=0;
            }
        });
    }

    public void getResults() {
        CheckBox Chanswer1=(CheckBox) findViewById(R.id.CHans1);
        CheckBox Chanswer2=(CheckBox) findViewById(R.id.CHans2);
        CheckBox Chanswer3=(CheckBox) findViewById(R.id.CHans3);
        RadioButton answer1=(RadioButton)findViewById(R.id.ans2);
        RadioButton answer2=(RadioButton)findViewById(R.id.an3);
        EditText edit=(EditText)findViewById(R.id.edit_ans);
        //answer for Q 1
        if(answer1.isChecked())
        {
            Result++;
        }
        //answer for Q 2
        if(answer2.isChecked())
        {
            Result++;
        }

        //check box

        if(Chanswer1.isChecked() &&Chanswer2.isChecked() && ! Chanswer3.isChecked() )
        {
            Result++;
        }


        if (edit.getText().toString().equalsIgnoreCase("2"))
        {
            Result++;
        }
        else if(edit.getText().toString().equalsIgnoreCase(""))
        {
            Toast.makeText(getApplicationContext(),"Please, Enter Your Answer",Toast.LENGTH_SHORT).show();

        }


    }

}
