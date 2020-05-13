package com.l.seva_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class Comment extends AppCompatActivity {
    private Firebase Ref;
    EditText username,feedback;
 Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);
        btn = findViewById(R.id.btn);
        username = findViewById(R.id.username);
        feedback = findViewById(R.id.feedback);
        Firebase.setAndroidContext(this);
        Ref = new Firebase("https://sevaapp-f9896.firebaseio.com/");
    }

    public void feedbacksent(View view) {
        String usernameinput = username.getText().toString();
        String feedbackinput = feedback.getText().toString();
        Firebase Reusername  = Ref.child("Username");
        Reusername.setValue(usernameinput);
        Firebase Reffeedback=Ref.child("Feedback");
        Reffeedback.setValue(feedbackinput);
    }
}
