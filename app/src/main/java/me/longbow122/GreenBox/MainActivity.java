package me.longbow122.GreenBox;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.maps.MapView;

/**
 * Main Activity Class for the GreenBox app. Called program code is run here.
 * No GUI work is done here, it will all be done in a new class to ensure that more UI control is allowed.
 */
public class MainActivity extends AppCompatActivity {

    /*
    TODO
    Ensure that the buttons are back in, and ensure that listeners are set up to make it so that they can be clicked.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_guiactivity);
        ImageView homeButton = findViewById(R.id.homeButton);
        homeButton.setOnClickListener(v -> clickHomeButton());
        findViewById(R.id.weeklyReportButton).setOnClickListener(v -> clickWeeklyReport());
        findViewById(R.id.leaderboardButton).setOnClickListener(v -> clickLeaderboard());
    }

    private void clickHomeButton() {
        ImageView image = findViewById(R.id.homeButton);
        System.out.println("Home button clicked!");
    }

    private void clickWeeklyReport() {
        ImageView image = findViewById(R.id.weeklyReportButton);
        System.out.println("Weekly Report Clicked!");
        setContentView(R.layout.activity_weekly_report);
    }

    private void clickLeaderboard() {
        System.out.println("Leaderboard Button Clicked!");
        setContentView(R.layout.activity_leaderboard);

    }
}