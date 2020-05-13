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


public class SoiltestingFragment extends Fragment {


    public SoiltestingFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_soiltesting, container, false);
        WebView soilpage = (WebView) rootView.findViewById(R.id.netId);
        WebSettings webSettings = soilpage.getSettings();
        webSettings.setJavaScriptEnabled(true);
        soilpage.loadUrl("file:///android_asset/soiltesting.html");
        return rootView;

    }
}