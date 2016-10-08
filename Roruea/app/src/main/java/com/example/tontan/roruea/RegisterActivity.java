package com.example.tontan.roruea;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etname = (EditText) findViewById(R.id.edname);
        final EditText etusername = (EditText) findViewById(R.id.edusername);
        final EditText etpassword = (EditText) findViewById(R.id.edpassword);
        final EditText etemail = (EditText) findViewById(R.id.edmail);
        final Button bRegister = (Button) findViewById(R.id.btreg);

        bRegister.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                final String username = etusername.getText().toString();
                final String password = etpassword.getText().toString();
                final String name = etname.getText().toString();
                final String email = etemail.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>(){
                  public void onResponse(String response){
                      try {
                          JSONObject jsonResponse = new JSONObject(response);
                          boolean success = jsonResponse.getBoolean("success");

                          if (success) {
                              Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                              RegisterActivity.this.startActivity(intent);
                          }else {
                              AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                              builder.setMessage("Register Failed")
                                      .setNegativeButton("Retry",null)
                                      .create()
                                      .show();
                          }

                      } catch (JSONException e){
                          e.printStackTrace();
                      }
                  }
                };

                RegisterRequest registerRequest = new RegisterRequest(username,password,name,email, responseListener);
                RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                queue.add(registerRequest);
            }
        });

    }
}
