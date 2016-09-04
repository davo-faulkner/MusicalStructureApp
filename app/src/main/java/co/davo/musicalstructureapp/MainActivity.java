package co.davo.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView topChartsTextView = (TextView) findViewById(R.id.top_charts_textView);

        topChartsTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topChartsIntent = new Intent(MainActivity.this, TopChartsActivity.class);

                startActivity(topChartsIntent);

            }

        });

        TextView newReleasesTextView = (TextView) findViewById(R.id.new_releases_textView);

        newReleasesTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newReleasesIntent = new Intent(MainActivity.this, NewReleasesActivity.class);

                startActivity(newReleasesIntent);

            }
        });
    }
}

