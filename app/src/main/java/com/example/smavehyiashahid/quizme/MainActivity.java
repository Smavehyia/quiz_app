package com.example.smavehyiashahid.quizme;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int correctAnswers =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void correctAnswer1(View view){
        Toast toast= Toast.makeText(this,"Awesome Job! You are correct!", Toast.LENGTH_SHORT);
        toast.show();
        String a;
        Button button = (Button) findViewById(R.id.correctAnswer1);
        button.setEnabled(false);
        correctAnswers++;
        submitQuiz(view);
    }
    public void correctAnswer2(View view){
        Toast toast= Toast.makeText(this,"Awesome Job! You are correct!", Toast.LENGTH_SHORT);
        toast.show();
        String a;
        Button button = (Button) findViewById(R.id.correctAnswer2);
        button.setEnabled(false);
        correctAnswers++;
        submitQuiz(view);
    }

    public void correctAnswer3(View view){
        Toast toast= Toast.makeText(this,"Awesome Job! You are correct!", Toast.LENGTH_SHORT);
        toast.show();
        String a;
        Button button = (Button) findViewById(R.id.correctAnswer3);
        button.setEnabled(false);
        correctAnswers++;
        submitQuiz(view);
    }

    public void correctAnswer4(View view){
        Toast toast= Toast.makeText(this,"Awesome Job! You are correct!", Toast.LENGTH_SHORT);
        toast.show();
        String a;
        Button button = (Button) findViewById(R.id.correctAnswer4);
        button.setEnabled(false);
        correctAnswers++;
        submitQuiz(view);
    }

    public void correctAnswer5(View view){
        Toast toast= Toast.makeText(this,"Awesome Job! You are correct!", Toast.LENGTH_SHORT);
        toast.show();
        String a;
        Button button = (Button) findViewById(R.id.correctAnswer5);
        button.setEnabled(false);
        correctAnswers++;
        submitQuiz(view);
    }
    public void incorrectAnswer(View view){
        Toast toast= Toast.makeText(this,"Oops! Try again!", Toast.LENGTH_LONG);
        toast.show();
    }

    public void submitQuiz(View view){
        TextView scoreView = (TextView) findViewById(R.id.score);
        scoreView.setText(""+correctAnswers);

    }

    public void shareWithFriends(View view){
        Intent intent= new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "My High Score for QuizMe!");
        String msg = emailMsg();
        intent.putExtra(Intent.EXTRA_TEXT, msg);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public String emailMsg(){
        String msg="Hey you! Check out my amazing high score in QuizMe, coolest coding quiz app! I have a score of: "+ correctAnswers +"! Try and beat me! And don't forget to send me your results too!";
        msg+="\n PS: ";
        EditText commentView = (EditText) findViewById(R.id.comment);
        msg+=commentView.getText().toString();
        return msg;
    }
}
