package com.example.agameoficeandfire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HowRelatedqpage extends AppCompatActivity {
     String text;
    String ImageId;
    int Quesid;
    String Question;
    String[] Choices;
    String CorrectAnswer;
    int score;

    {
        score = 0;
    }

    int i = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_relatedqpage);
        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl(apihr.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apihr apihr= retrofit.create(com.example.agameoficeandfire.apihr.class);
        Call<List<howrelatedquestions>> call= apihr.getquestions();
        call.enqueue(new Callback<List<howrelatedquestions>>() {
            @Override
            public void onResponse(Call<List<howrelatedquestions>> call, Response<List<howrelatedquestions>> response) {
                List<howrelatedquestions> howrelatedquestions = response.body();


                final TextView Score=(TextView) findViewById(R.id.Score) ;
                TextView textView = (TextView) findViewById(R.id.hrq);
                final Button button1 = (Button) findViewById(R.id.choicehr1);
                final Button button2 = (Button) findViewById(R.id.choicehr2);
                final Button button3 = (Button) findViewById(R.id.choicehr3);
                final Button nextquestion=(Button) findViewById(R.id.nextquestion) ;


                while (howrelatedquestions.get(i).getQuesid() <= howrelatedquestions.size()) {

                    Question = howrelatedquestions.get(i).getQuestion();
                    Choices = howrelatedquestions.get(i).getChoices();
                    CorrectAnswer = howrelatedquestions.get(i).getCorrectAnswer();
                    ImageId = howrelatedquestions.get(i).getImageId();
                    text = howrelatedquestions.get(i).getText();
                    textView.setText(Question);
                    button1.setText(Choices[0]);
                    button2.setText(Choices[1]);
                    button3.setText(Choices[2]);
                    final String finalCorrectAnswer = CorrectAnswer;
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String check = button1.getText().toString();
                            if (check.contentEquals(finalCorrectAnswer)) {
                                score++;
                                button1.setText("Correct Answer");
                                button1.setBackgroundColor(getResources().getColor(R.color.correctgreen));
                            } else if (!check.contentEquals(finalCorrectAnswer)) {
                                button1.setText("Wrong Answer");
                                button1.setBackgroundColor(getResources().getColor(R.color.wrongred));
                            }
                            Score.setText(score);
                        }
                    });
                    button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String check = button2.getText().toString();
                            if (check.contentEquals(finalCorrectAnswer)) {
                                score++;
                                button2.setText("Correct Answer");
                                button2.setBackgroundColor(getResources().getColor(R.color.correctgreen));
                            } else if (!check.contentEquals(finalCorrectAnswer)) {
                                button2.setText("Wrong Answer");
                                button2.setBackgroundColor(getResources().getColor(R.color.wrongred));
                            }
                            Score.setText(score);
                        }
                    });
                    button3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String check = button3.getText().toString();
                            if (check.contentEquals(finalCorrectAnswer)) {
                                score++;
                                button3.setText("Correct Answer");
                                button3.setBackgroundColor(getResources().getColor(R.color.correctgreen));
                            } else if (!check.contentEquals(finalCorrectAnswer)) {
                                button3.setText("Wrong Answer");
                                button3.setBackgroundColor(getResources().getColor(R.color.wrongred));
                            }
                            Score.setText(score);
                        }
                    });
                    nextquestion.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            i++;
                        }
                    });




                }



            }


            @Override
            public void onFailure (Call < List < howrelatedquestions >> call, Throwable t){
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
