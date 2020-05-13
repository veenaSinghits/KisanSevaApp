package com.l.seva_app;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class ManureFragment extends Fragment {


    public ManureFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_manure, container, false);
        WebView Kisanpage = (WebView) rootView.findViewById(R.id.NetId);
        WebSettings webSettings = Kisanpage.getSettings();
        webSettings.setJavaScriptEnabled(true);
        Kisanpage.loadUrl("file:///android_asset/Manure.html");
        return rootView;

    }
}