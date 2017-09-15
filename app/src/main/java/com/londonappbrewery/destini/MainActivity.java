package com.londonappbrewery.destini;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView story;
    Button top;
    Button bottom;
    int mTop=0;
    int mBot=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        story = (TextView) findViewById(R.id.storyTextView);
        top = (Button) findViewById(R.id.buttonTop);
        bottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Destini", "Top Button pressed");
                mTop++;
                update(mTop, mBot);
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Destini", "Bottom Button pressed");
                mBot++;
                update(mTop, mBot);
            }
        });

    }

    public void update(int mTop, int mBot){
        if(mTop==0 && mBot==0){
            story.setText(R.string.T1_Story);
            top.setText(R.string.T1_Ans1);
            bottom.setText(R.string.T1_Ans2);
        }
        else if(mTop==1 && mBot==0){
            story.setText(R.string.T3_Story);
            top.setText(R.string.T3_Ans1);
            bottom.setText(R.string.T3_Ans2);
        }
        else if(mTop==2 && mBot==0){
            story.setText(R.string.T6_End);
            top.setVisibility(View.GONE);
            bottom.setText("Press to exit Application");
        }
        else if(mTop==1 && mBot==1){
            story.setText(R.string.T5_End);
            top.setVisibility(View.GONE);
            bottom.setText("Press to exit Application");
        }
        else if(mTop==0 && mBot==1){
            story.setText(R.string.T2_Story);
            top.setText(R.string.T2_Ans1);
            bottom.setText(R.string.T2_Ans2);
        }
        else if(mTop==1 && mBot==1){
            story.setText(R.string.T3_Story);
            top.setText(R.string.T3_Ans1);
            bottom.setText(R.string.T3_Ans2);
        }
        else if(mTop==2 && mBot==1){
            story.setText(R.string.T6_End);
            top.setVisibility(View.GONE);
            bottom.setText("Press to exit Application");
        }
        else if(mTop==1 && mBot==2){
            story.setText(R.string.T5_End);
            top.setVisibility(View.GONE);
            bottom.setText("Press to exit Application");
        }
        else if(mTop==0 && mBot==2){
            story.setText(R.string.T4_End);
            top.setVisibility(View.GONE);
            bottom.setText("Press to exit Application");
        }
        else{
            finish();
        }

    }
}
