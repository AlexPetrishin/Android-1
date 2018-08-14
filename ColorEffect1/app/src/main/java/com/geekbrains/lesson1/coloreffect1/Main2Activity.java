package com.geekbrains.lesson1.coloreffect1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        Button button = (Button) findViewById(R.id.button_share);
        button.setOnClickListener(onClickListener);
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {


        @Override
        public void onClick(View view) {
            String sendText = Main2Activity.EXTRA_MESSAGE;
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT,sendText);
            String chooserTitle = getString(R.string.chooser_title);
            Intent choosenIntent = Intent.createChooser(intent,chooserTitle);
            startActivity(choosenIntent);
        }
    };

}

