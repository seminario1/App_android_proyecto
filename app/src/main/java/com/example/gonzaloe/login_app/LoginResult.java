package com.example.gonzaloe.login_app;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginResult extends AppCompatActivity {
   private String name,email,avatar;
   private Context root = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_result);
        avatar = this.getIntent().getExtras().getString("avatar");
        name = this.getIntent().getExtras().getString("email");
        email = this.getIntent().getExtras().getString("name");
        loadcomponents();
    }

    private void loadcomponents() {
        TextView txtname= this.findViewById(R.id.name);
        TextView txtemail= this.findViewById(R.id.email);
        txtemail.setText(name);
        txtname.setText(email);
        Button btn = this.findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(root,MainActivity.class);
            }
        });

    }
}
