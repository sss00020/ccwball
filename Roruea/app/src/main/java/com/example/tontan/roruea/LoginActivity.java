package com.example.tontan.roruea;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etlogusername = (EditText) findViewById(R.id.edLogusername);
        final EditText etlogpassword = (EditText) findViewById(R.id.edLogpassword);
        final Button btlogin = (Button) findViewById(R.id.btlogin);
        final TextView reglink = (TextView) findViewById(R.id.txtreglink);

        reglink.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent regiterIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(regiterIntent);
            }
        });

        btlogin.setOnClickListener(new View.OnClickListener(){

            public  void onClick(View v){
                final String username = etlogusername.getText().toString();
                final String password = etlogpassword.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    public void onResponse(String response){

                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");

                            if (success){
                                String name = jsonResponse.getString("name");
                                String email = jsonResponse.getString("email");

                                Intent intent = new Intent(LoginActivity.this, UserAreaActivity.class);
                                intent.putExtra("username",username);
                                intent.putExtra("name",name);
                                intent.putExtra("email",email);

                                LoginActivity.this.startActivity(intent);

                            }else{
                                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                                builder.setMessage("Login Failed")
                                        .setNegativeButton("Retry",null)
                                        .create()
                                        .show();
                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                LoginRequest loginRequest = new LoginRequest(username,password,responseListener);
                RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
                queue.add(loginRequest);
            }
        });
    }
}
