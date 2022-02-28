package me.longbow122.GreenBox;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TextView message;
    // Test comment

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView scanImage = findViewById(R.id.scanRFIDButton);
        message = findViewById(R.id.testString);

        // Attach a click listener for the scan image.
        scanImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickScan();
            }
        });
    }

    private void clickScan() {
        message.setText("lmao");
        System.out.println("Scanner for distance was clicked!");
    }
}