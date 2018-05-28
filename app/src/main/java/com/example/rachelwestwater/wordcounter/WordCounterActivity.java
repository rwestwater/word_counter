package com.example.rachelwestwater.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {


    EditText sentenceEditText;
    TextView answer;
    Button enterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        sentenceEditText = findViewById(R.id.sentence);
        answer = findViewById(R.id.answer);
        enterButton = findViewById(R.id.enter);
    }

    public void onEnterButtonClicked(View button){

        WordCounter wordCounter = new WordCounter();
        int answer = wordCounter.getWordCount(sentenceEditText.getText().toString());
        this.answer.setText(Integer.toString(answer));
    }

}
