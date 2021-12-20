package com.emergency.mypaenavigationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView

class WebsiteActivity : AppCompatActivity() {
    var myWebsite:WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website)
        //conversion of website ot app

        myWebsite = findViewById(R.id.webView)
        var mySettings:WebSettings = myWebsite!!.settings
        mySettings.javaScriptEnabled = true
        myWebsite!!.loadUrl("file:///android_asset/home.html")
    }
}