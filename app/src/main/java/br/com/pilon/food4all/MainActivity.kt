package br.com.pilon.food4all

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val parceiros = findViewById<Button>(R.id.btnParceiros)
        parceiros.setOnClickListener {
            val intent = Intent(this, actParceiros::class.java)
            startActivity(intent)
        }

    }
}