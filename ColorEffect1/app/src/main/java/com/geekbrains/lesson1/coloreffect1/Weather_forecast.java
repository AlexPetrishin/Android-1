package com.geekbrains.lesson1.coloreffect1;

import android.content.Context;

import com.geekbrains.lesson1.coloreffect1.R;

class Weather_forecast {
    static String getWeather_forecast(Context context, int position) {

        String[] result = context.getResources().getStringArray(R.array.weather_forecast);

        String weather_forecast = result[position];

        return weather_forecast;
    }


}
