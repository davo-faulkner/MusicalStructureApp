package co.davo.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button topChartsButton = (Button) findViewById(R.id.top_charts_button);

        topChartsButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topChartsIntent = new Intent(MainActivity.this, TopChartsActivity.class);
                startActivity(topChartsIntent);
            }
        });

        Button newReleasesButton = (Button) findViewById(R.id.new_releases_button);

        newReleasesButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newReleasesIntent = new Intent(MainActivity.this, NewReleasesActivity.class);
                startActivity(newReleasesIntent);
            }
        });
    }
}

