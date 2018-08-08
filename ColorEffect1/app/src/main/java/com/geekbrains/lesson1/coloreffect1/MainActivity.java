package com.geekbrains.lesson1.coloreffect1;

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

        textView_weather_forecast = (TextView) findViewById(R.id.textView_weather_forecast);

        spinner = (Spinner) findViewById(R.id.spinner);

        Button button = (Button) findViewById(R.id.button_weather);
        button.setOnClickListener(onClickListener);
    }

    private final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String weather_forecast = Weather_forecast.getWeather_forecast(MainActivity.this,
                    (int) spinner.getSelectedItemId());
            textView_weather_forecast.setText(weather_forecast);
        }
    };
}

