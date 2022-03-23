package me.longbow122.GreenBox;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class LeaderboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);
        findViewById(R.id.leaderboard_homeButton).setOnClickListener(v -> clickHomeButton());
        findViewById(R.id.leaderboard_leaderboard).setOnClickListener(v -> clickLeaderboard());
        findViewById(R.id.leaderboard_weeklyReport).setOnClickListener(v -> clickWeeklyReport());
    }

    private void clickHomeButton() {
        System.out.println("Home Button clicked!");
        setContentView(R.layout.activity_main_guiactivity);

    }

    private void clickLeaderboard() {
        System.out.println("Leaderboard Button clicked!");
    }

    private void clickWeeklyReport() {
        System.out.println("Weekly Report button clicked!");
        setContentView(R.layout.activity_weekly_report);
    }
}