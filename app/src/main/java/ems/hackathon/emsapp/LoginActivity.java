package ems.hackathon.emsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import info.hoang8f.widget.FButton;

public class LoginActivity extends AppCompatActivity {

    EditText txtAadhar;
    FButton btnLogin;
    String aadhar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtAadhar = findViewById(R.id.editTextAadhar);
        btnLogin = findViewById(R.id.buttonLogin);

/*        txtAadhar.addTextChangedListener(new TextWatcher() {
            int prevL = 0;

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                prevL = txtAadhar.getText().toString().length();
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                int length = s.length();
                if ((prevL <= length) && length == 5) {

                    String data = txtAadhar.getText().toString();
                    String beginData = data.substring(0, 4);

                    String endData = Character.toString(data.charAt(length - 1));
                    txtAadhar.setText(beginData + "-" + endData);
                    txtAadhar.setSelection(length + 1);
                }
            }
        });*/

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aadhar = txtAadhar.getText().toString().replace("-", "");
                if (aadhar.length() == 10) {
                    Intent intent = new Intent(getApplication(), MainActivity.class);
                    startActivity(intent);
                        Toast.makeText(getApplication(), "Login successful!!", Toast.LENGTH_LONG).show();
                        finish();
                    } else {
                        Toast.makeText(getApplication(), "Enter Valid  ID !!", Toast.LENGTH_LONG).show();
                    }
                }

            }
        );
    }
}
