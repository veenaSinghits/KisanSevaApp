package com.l.seva_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class help_box extends AppCompatActivity {


        Button button1,button2,button3;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_help_box);
            button1 = findViewById(R.id.textbt);
            button2 = findViewById(R.id.mailbt);
            button3 = findViewById(R.id.callbt);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String number = "";  // The number on which you want to send SMS
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", number, null)));
                }
            });
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("message/rfc822");
                    i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"recipient@example.com"});
                    i.putExtra(Intent.EXTRA_SUBJECT, "help");
                    i.putExtra(Intent.EXTRA_TEXT   , "body of email");
                    try {
                        startActivity(Intent.createChooser(i, "Send mail..."));
                    } catch (android.content.ActivityNotFoundException ex) {
                        Toast.makeText(help_box.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                    }

                }
            });
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String phone = "";
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                    startActivity(intent);

                }
            });
        }
}
