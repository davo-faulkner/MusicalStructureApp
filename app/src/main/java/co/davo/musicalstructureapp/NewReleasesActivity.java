package co.davo.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NewReleasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_releases);

        Button nowPlayingButton = (Button) findViewById(R.id.now_playing_button);

        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(NewReleasesActivity.this, MainActivity.class);

                startActivity(nowPlayingIntent);
            }
        });

        Button topChartsButton = (Button) findViewById(R.id.top_charts_button);

        topChartsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topChartsIntent = new Intent(NewReleasesActivity.this, TopChartsActivity.class);

                startActivity(topChartsIntent);
            }
        });
    }
}
