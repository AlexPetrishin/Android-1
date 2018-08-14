package com.geekbrains.lesson1.coloreffect1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView_weather_forecast;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initViews();

        Button button = (Button) findViewById(R.id.button_weather);
        button.setOnClickListener(onClickListener);
    }

    private void initViews() {
        textView_weather_forecast = (TextView) findViewById(R.id.textView_weather_forecast);
        spinner = (Spinner) findViewById(R.id.spinner);
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String weather_forecast = Weather_forecast.getWeather_forecast(MainActivity.this,
                    (int) spinner.getSelectedItemId());
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra(Main2Activity.EXTRA_MESSAGE,weather_forecast);
            startActivity(intent);
        }
    };
}

