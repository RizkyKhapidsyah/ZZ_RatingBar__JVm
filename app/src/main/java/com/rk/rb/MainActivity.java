package com.rk.rb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import java.net.NetworkInterface;

public class MainActivity extends AppCompatActivity {

    RatingBar RB_1_IDJAVA;
    TextView TV_1_IDJAVA;
    String TRB = "Rating : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RB_1_IDJAVA = findViewById(R.id.RB_1_IDXML);
        TV_1_IDJAVA = findViewById(R.id.TV_1_IDXML);
    }

    public void Ketika_Di_Pijit(View Tampil) {
        float NilaiRating = RB_1_IDJAVA.getRating();

        if (NilaiRating < 2) {
            TV_1_IDJAVA.setText(TRB + NilaiRating + "\nIs it that worse?");
        } else if (NilaiRating <= 3 && NilaiRating >= 2) {
            TV_1_IDJAVA.setText(TRB + NilaiRating + "\nWe will try to be better!");
        } else if (NilaiRating > 3 && NilaiRating <= 4) {
            TV_1_IDJAVA.setText(TRB + NilaiRating + "\nThat means you are having a good time here!");
        } else if (NilaiRating > 4) {
            TV_1_IDJAVA.setText(TRB + NilaiRating + "\nWow! We Will keep up the good work");
        }
    }

}
