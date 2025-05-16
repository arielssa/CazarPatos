package com.ariel.sanchez.cazarpatos

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import com.ariel.sanchez.cazarpatos.MainActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var loginButton : Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        loginButton = findViewById<Button>(R.id.loginButton);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        loginButton.setOnClickListener{
            val transition = Intent(this, MainActivity::class.java);
            startActivity(transition);
        }
    }
}