package me.longbow122.GreenBox;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class WeeklyReportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_report);
        findViewById(R.id.weeklyreport_leaderboard).setOnClickListener(v -> clickLeaderboard());
        findViewById(R.id.weeklyreport_weeklyReport).setOnClickListener(v -> clickWeeklyReport());
        findViewById(R.id.weeklyreport_homeButton).setOnClickListener(v -> clickHomeButton());
    }

    private void clickLeaderboard() {
        System.out.println("Leaderboard button clicked!");
        setContentView(R.layout.activity_leaderboard);
    }

    private void clickHomeButton() {
        System.out.println("Home button clicked!");
        setContentView(R.layout.activity_main_guiactivity);
    }

    private void clickWeeklyReport() {
        System.out.println("Weekly Report Button clicked!");
    }
}