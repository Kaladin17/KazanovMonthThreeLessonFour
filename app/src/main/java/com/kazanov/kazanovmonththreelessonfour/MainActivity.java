package com.kazanov.kazanovmonththreelessonfour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String [] words = {"история ", "лексус", "мандарин", "крот", "вода", "ветер", "деньги", "стирка", "зебра"};
    String[] consonants = {"а", "е", "и", "о", "у", "ы", "э", "ю", "я"};
    String name = "казанов денис";
    char [] examinationName = name.toCharArray();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < words.length; i++) {
            char [] examination = words[i].toCharArray();
            for (int j = 0; j < examination.length; j++) {
                for (int k = 0; k < consonants.length; k++) {
                    if (consonants[k].equals(examination[j])){
                        break;
                    }else {
                        System.out.println(examination[j]);
                    }
                }
            }
        }
        for (int k = 0; k < examinationName.length; k++) {
            for (int i = 0; i < words.length; i++) {
                char [] examination = words[i].toCharArray();
                for (int j = 0; j < examination.length; j++) {
                    if (examination[j] == examinationName[k]){
                        System.out.print(examination[j]);
                    }continue;
                }
            }
        }
    }
}