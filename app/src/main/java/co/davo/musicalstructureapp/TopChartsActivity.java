package co.davo.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TopChartsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_charts);

        Button nowPlayingButton = (Button) findViewById(R.id.now_playing_button);

        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(TopChartsActivity.this, MainActivity.class);

                startActivity(nowPlayingIntent);
            }
        });

        Button newReleasesButton = (Button) findViewById(R.id.new_releases_button);

        newReleasesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newReleasesIntent = new Intent(TopChartsActivity.this, NewReleasesActivity.class);

                startActivity(newReleasesIntent);

            }
        });
    }
}
