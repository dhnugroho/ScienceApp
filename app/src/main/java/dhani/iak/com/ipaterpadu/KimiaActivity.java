package dhani.iak.com.ipaterpadu;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class KimiaActivity extends AppCompatActivity {
    private static final String LOG_TAG = FisikaActivity.class.getSimpleName();
    // Question 6
    EditText question6_answer;
    // Question 7
    CheckBox question7_choice1;
    CheckBox question7_choice2;
    CheckBox question7_choice3;
    CheckBox question7_choice4;
    // Question 8
    EditText question8_answer;
    // Question 9
    RadioButton question9_choice2;
    // Question 10
    EditText question10_answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_kimia);
    }


    public void submitAnswers(View view) {
        CharSequence resultsDisplay;
        Log.e(LOG_TAG, " " + this.findViewById(R.id.question3_choice3));
        int answer6_score;
        int answer7_score;
        int answer8_score;
        int answer9_score;
        int answer10_score;
        int final_score;

        //------------------------------------------------------------------------------------------
        // Question 6 - Correct Answer is "Clouds" or "Cloud"
        //------------------------------------------------------------------------------------------
        String answer6;
        question6_answer = (EditText) this.findViewById(R.id.question6_answer);
        answer6 = question6_answer.getText().toString().toLowerCase();
        if (answer6.equals("clouds") || answer6.equals("cloud")) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 7  - Correct Answers are #3 (Earth) and #4 (Pluto)
        //------------------------------------------------------------------------------------------
        Boolean answer7_choice1;
        Boolean answer7_choice2;
        Boolean answer7_choice3;
        Boolean answer7_choice4;
        question7_choice1 = (CheckBox) this.findViewById(R.id.question7_choice1);
        question7_choice2 = (CheckBox) this.findViewById(R.id.question7_choice2);
        question7_choice3 = (CheckBox) this.findViewById(R.id.question7_choice3);
        question7_choice4 = (CheckBox) this.findViewById(R.id.question7_choice4);
        answer7_choice1 = question7_choice1.isChecked();
        answer7_choice2 = question7_choice2.isChecked();
        answer7_choice3 = question7_choice3.isChecked();
        answer7_choice4 = question7_choice4.isChecked();
        if (!answer7_choice1 && !answer7_choice2 && answer7_choice3 && answer7_choice4) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 8 - Correct Answer is "Wrist"
        //------------------------------------------------------------------------------------------
        String answer8;
        question8_answer = (EditText) this.findViewById(R.id.question8_answer);
        answer8 = question8_answer.getText().toString().toLowerCase();
        if (answer8.equals("wrist")) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 9  - Correct Answers is #2 "Stalagmites"
        //------------------------------------------------------------------------------------------
        Boolean answer9;
        question9_choice2 = (RadioButton) this.findViewById(R.id.question9_choice2);
        answer9 = question9_choice2.isChecked();
        if (answer9) {
            answer9_score = 1;
        } else {
            answer9_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 10 - Correct Answer is "Smelting"
        //------------------------------------------------------------------------------------------
        String answer10;
        question10_answer = (EditText) this.findViewById(R.id.question10_answer);
        answer10 = question10_answer.getText().toString().toLowerCase();
        if (answer10.equals("smelting")) {
            answer10_score = 1;
        } else {
            answer10_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Final Score
        //------------------------------------------------------------------------------------------
        final_score = answer6_score + answer7_score + answer8_score + answer9_score + answer10_score;

        if (final_score == 5) {
            resultsDisplay = "Perfect! You scored 5 out of 5";
        } else {
            resultsDisplay = "Try again. You scored " + final_score + " out of 5";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}



