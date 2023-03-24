package com.example.educate

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class VariousDev : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_various_dev)

        val androidDev = findViewById<TextView>(R.id.androidDev)
        val webDev = findViewById<TextView>(R.id.webDev)
        val iosDev = findViewById<TextView>(R.id.iosDev)
        val ml = findViewById<TextView>(R.id.ml)
        val blockchain = findViewById<TextView>(R.id.blockchain)
        val cyberSecurity = findViewById<TextView>(R.id.cyberSecurity)
        val contact = findViewById<Button>(R.id.contact)

        androidDev.setOnClickListener {
            setContentView(R.layout.android_dev)
        }
        iosDev.setOnClickListener {
            setContentView(R.layout.ios_dev)
        }
        webDev.setOnClickListener {
            setContentView(R.layout.web_dev)
        }
        ml.setOnClickListener {
            setContentView(R.layout.machine_learning)
        }
        blockchain.setOnClickListener {
            setContentView(R.layout.blockchain)
        }
        cyberSecurity.setOnClickListener {
            setContentView(R.layout.cyber_security)
        }
        contact.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:+919999999999")
            }
            if (intent.resolveActivity(packageManager) != null) {
                Toast.makeText(applicationContext, "Contacting us...", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            }
        }
    }
}