package com.h14jogus.radio_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import co.mobiwise.library.RadioListener;
import co.mobiwise.library.RadioManager;


public class MainActivity extends AppCompatActivity implements RadioListener{

    RadioManager radioManager = RadioManager.with(this);
    private static final String RADIO_URL = "http://www.abc.net.au/res/streaming/audio/aac/abc_jazz.pls";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Halllllllo
        // moj

        radioManager.registerListener(this);
        radioManager.enableNotification(true);

    }

    @Override
    protected void onStart() {
        super.onStart();
        radioManager.connect();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        radioManager.disconnect();
    }

    @Override
    public void onRadioConnected() {

    }

    @Override
    public void onRadioStarted() {


    }

    @Override
    public void onRadioStopped() {

    }

    @Override
    public void onMetaDataReceived(String s, String s1) {

    }

    public void startRadio(View view) {
        radioManager.startRadio(RADIO_URL);
    }

    public void stopRadio(View view) {
        radioManager.stopRadio();
    }
}
