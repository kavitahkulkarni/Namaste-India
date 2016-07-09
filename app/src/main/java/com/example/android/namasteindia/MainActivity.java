package com.example.android.namasteindia;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = (TextView) findViewById(R.id.welcome_text);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Chantelli_Antiqua.ttf");
        txt.setTypeface(font);

    }

    /**
     * To help user with Hindi language
     */
    public void hindiHelp (View view) {
        Intent intent = new Intent(this, hindiLanguage.class);
        startActivity(intent);
    }

    /**
     * To help user with Marathi language
     */
    public void marathiHelp (View view) {
        Intent intent = new Intent(this, MarathiLanguage.class);
        startActivity(intent);
    }

    /**
     * To help user with GUjarati language
     */
    public void gujaratiHelp (View view) {
        Intent intent = new Intent(this, GujaratiLanguage.class);
        startActivity(intent);
    }
    /**
     * To help user with Bengali language
     */
    public void bengaliHelp (View view) {
        Intent intent = new Intent(this, BengaliLanguage.class);
        startActivity(intent);
    }
    /**
     * To help user with Kannada language
     */
    public void kannadaHelp (View view) {
        Intent intent = new Intent(this, KannadaLanguage.class);
        startActivity(intent);
    }

    /**
     * To help user with Tamil language
     */
    public void tamilHelp (View view) {
        Intent intent = new Intent(this, TamilLanguage.class);
        startActivity(intent);
    }

    /**
     * To help user with about info
     */
    public void aboutInfo (View view) {
        Intent intent = new Intent(this, AboutInfo.class);
        startActivity(intent);
    }

}
