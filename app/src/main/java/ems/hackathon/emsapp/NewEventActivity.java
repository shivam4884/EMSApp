package ems.hackathon.emsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class NewEventActivity extends AppCompatActivity {

    TextView tvName,tvMeeting;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_event);
        tvMeeting=findViewById(R.id.tvMeeting);
        tvName=findViewById(R.id.tvMeeting);
        spinner=findViewById(R.id.spinner);
    }
}
