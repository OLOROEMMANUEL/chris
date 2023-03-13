package com.example.tradingview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class community : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_community, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val myProductView: WebView = view.findViewById(R.id.nav_community)
        myProductView.webViewClient = object: WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }

        myProductView.loadUrl("https://www.tradingview.com/community/")
        myProductView.settings.javaScriptEnabled
        myProductView.settings.allowContentAccess = true
        myProductView.settings.useWideViewPort = true
        myProductView.settings.domStorageEnabled = true
    }
}