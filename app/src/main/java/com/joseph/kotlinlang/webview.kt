package com.joseph.kotlinlang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import android.webkit.WebView


class webview : AppCompatActivity() {

    private val webView: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)
        webView?.webViewClient = WebViewClient()
         val webView = findViewById<WebView>(R.id.webView)
        // this will load the url of the website
        webView.loadUrl("https://www.geeksforgeeks.org/")
        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webSettings.setSupportZoom(true)
    }
       override fun onBackPressed() {
           if (webView!!.canGoBack()) {
                   webView.goBack()
               } else {
                   super.onBackPressed()

               }

    }
}

