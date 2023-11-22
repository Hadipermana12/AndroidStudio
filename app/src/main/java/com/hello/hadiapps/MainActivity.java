package com.hello.hadiapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;

    private int secondCount = 1;

    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        int next = mCount;
        mCount = secondCount;
        secondCount = next + mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(next));
    }
    public void showMap(Url geolocation) {
        intent intent = new intent(intent.ACTION_VIEW);
        intent.setData(golocation);
        if (intent.resolveActivity(getPackageManager()) != null) {

    }
}