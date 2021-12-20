package com.emergency.mypaenavigationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var web:Button? = null
    var calc:Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calc = findViewById(R.id.btncalc)
        web = findViewById(R.id.btnweb)

        web!!.setOnClickListener {
            var endaKwaWeb = Intent(this,WebsiteActivity::class.java)
            startActivity(endaKwaWeb)
        }
        calc!!.setOnClickListener {
            startActivity(Intent(this,calculator::class.java))
            //this is the one line code version for the above activity

        }


    }
}