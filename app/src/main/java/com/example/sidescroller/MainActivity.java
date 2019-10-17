package com.example.sidescroller;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout hLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hLayout = findViewById(R.id.Layout);

        allPictures();
    }

    public void allPictures() {
        ImageButton button;
        for(int i =0; i < MechKeyboardDB.description.length; i++) {
            button = new ImageButton(this);
            MechKeyboard keyboard = new MechKeyboard(MechKeyboardDB.description[i], MechKeyboardDB.id[i]);
            button.setContentDescription(keyboard.getDescription());
            button.setImageDrawable(getResources().getDrawable(keyboard.getId()));
            hLayout.addView(button);
        }
    }

}
