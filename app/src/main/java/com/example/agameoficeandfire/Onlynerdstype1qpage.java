package com.example.agameoficeandfire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Onlynerdstype1qpage extends AppCompatActivity {
     String text;
    String ImageId;
    int Quesid;
    String Question;
    String[] AnswerPossibilities;

    int score;

    {
        score = 0;
    }

    int i = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onlynerdstype1qpage);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(apinerd1.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apinerd1 apinerd1 = retrofit.create(com.example.agameoficeandfire.apinerd1.class);
        Call<List<Onlynerdstype1ques>> call = apinerd1.getquestions();
        call.enqueue(new Callback<List<Onlynerdstype1ques>>() {
            @Override
            public void onResponse(Call<List<Onlynerdstype1ques>> call, Response<List<Onlynerdstype1ques>> response) {
                List<Onlynerdstype1ques> Onlynerdtype1ques = response.body();


                final TextView Score = (TextView) findViewById(R.id.Score);
                TextView textView = (TextView) findViewById(R.id.question);
                final EditText editText = (EditText) findViewById(R.id.useranswer);
                final Button submitanswer = (Button) findViewById(R.id.submitbutton);
                final Button nextquestion = (Button) findViewById(R.id.nextquestion);


                while (Onlynerdtype1ques.get(i).getQuesid() <= Onlynerdtype1ques.size()) {

                    Question = Onlynerdtype1ques.get(i).getQuestion();
                    AnswerPossibilities = Onlynerdtype1ques.get(i).getAnswerPossibilities();
                    ImageId = Onlynerdtype1ques.get(i).getImageId();
                     text = Onlynerdtype1ques.get(i).getText();
                    textView.setText(Question);
                    final boolean[] flag = {true};
                    submitanswer.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String useranswer = editText.getText().toString();
                            for (int j = 0; j < AnswerPossibilities.length; j++) {
                                if (useranswer.contentEquals(AnswerPossibilities[j])) {
                                    score++;
                                    submitanswer.setText("Correct Answer");
                                    submitanswer.setBackgroundColor(getResources().getColor(R.color.correctgreen));
                                    flag[0] = false;
                                    break;
                                }
                                if (flag[0]) {
                                    submitanswer.setText("Wrong Answer");
                                    submitanswer.setBackgroundColor(getResources().getColor(R.color.wrongred));
                                }
                                Score.setText(score);
                            }
                        }
                    });
                    nextquestion.setOnClickListener(new View.OnClickListener() {

                        public void onClick(View v) {
                            i++;
                        }
                    });


                }


            }


            public void onFailure(Call<List<Onlynerdstype1ques>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void knowmore(View view)
    {
        Intent intent = new Intent(this,KnowMore.class);
        intent.putExtra("ImageId", ImageId);
        intent.putExtra("Text", text);
        startActivity(intent);
    }
    public void exitquiz(View view)
    {
        Intent intent= new Intent(this,ExitPage.class);
        intent.putExtra("Score",score);
        startActivity(intent);
    }
}

