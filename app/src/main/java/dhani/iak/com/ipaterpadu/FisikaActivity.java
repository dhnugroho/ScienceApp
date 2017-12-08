package dhani.iak.com.ipaterpadu;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class FisikaActivity extends AppCompatActivity {
    private static final String LOG_TAG = FisikaActivity.class.getSimpleName();
    // Question 1
    RadioButton question1_choice3f;

    // Question 2
    RadioButton question2_choice2f;

    // Question 3
    RadioButton question3_choice3f;

    // Question 4
    RadioButton question4_choice3f;

    // Question 5
    RadioButton question5_choice3f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_fisika);
    }


    public void submitAnswers(View view) {
        CharSequence resultsDisplay;
        Log.e(LOG_TAG, " " + this.findViewById(R.id.question3_choice3f));
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int final_score;

        //------------------------------------------------------------------------------------------
        // Question 1 - Correct Answer is #3
        //------------------------------------------------------------------------------------------
        Boolean answer1;

        question1_choice3f = (RadioButton) this.findViewById(R.id.question1_choice3f);
        answer1 = question1_choice3f.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 2  - Correct Answers is #2
        //------------------------------------------------------------------------------------------
        Boolean answer2;
        question2_choice2f = (RadioButton) this.findViewById(R.id.question2_choice2f);
        answer2 = question2_choice2f.isChecked();
        if (answer2) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 3  - Correct Answers is #3
        //------------------------------------------------------------------------------------------
        Boolean answer3;
        question3_choice3f = (RadioButton) this.findViewById(R.id.question3_choice3f);
        answer3 = question3_choice3f.isChecked();
        if (answer3) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 4  - Correct Answers is #3
        //------------------------------------------------------------------------------------------
        Boolean answer4;
        question4_choice3f = (RadioButton) this.findViewById(R.id.question4_choice3f);
        answer4 = question4_choice3f.isChecked();
        if (answer4) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 5  - Correct Answers is #3
        //------------------------------------------------------------------------------------------
        Boolean answer5;
        question5_choice3f = (RadioButton) this.findViewById(R.id.question5_choice3f);
        answer5 = question5_choice3f.isChecked();
        if (answer5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Final Score
        //------------------------------------------------------------------------------------------
        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score ;

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


