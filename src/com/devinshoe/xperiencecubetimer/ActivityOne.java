package com.devinshoe.xperiencecubetimer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class ActivityOne extends Activity {
	// Initialize tvScramble
	TextView tvScramble = (TextView) findViewById(R.id.tvScramble);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        
        // Generate scramble and set it to tvScramble on boot
        tvScramble.setText(Scramble.ThreeByThree());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_one, menu);
        return true;
    }
    
}
