package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;   //import for create functions
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mGuessNumber =1;
    private TextView mShowNumber; //reference of the show_number TextView
    private CharSequence toast_message; //简易的消息提示框 notification message that want to display in the toast box
    private int randomNumber=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowNumber= (TextView) findViewById(R.id.show_number);
    }

    public void showToast(View view){
        if(mGuessNumber==randomNumber){
            toast_message="correct";
        }else{
            toast_message="wrong guessing";
        }

        Toast toast=Toast.makeText(this, toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view){
        if(mGuessNumber<9)
        {
            mGuessNumber++;
        }
        if(mShowNumber!=null)
        {
            mShowNumber.setText(Integer.toString(mGuessNumber));
        }
    }

    public void countDown(View view){
        if(mGuessNumber>1)
        {
            mGuessNumber--;
        }
        if(mShowNumber!=null)
        {
            mShowNumber.setText(Integer.toString(mGuessNumber));
        }
    }

}