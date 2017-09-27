package com.example.nikolett.a14p_buzas_nikolett_szines_hazi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button sargaGomb;
    private Button kekGomb;
    private Button pirosGomb;
    private Button zoldGomb;
    private TextView rgbKod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sargaGomb = (Button) findViewById(R.id.sargaGomb);
        kekGomb = (Button) findViewById(R.id.kekGomb);
        pirosGomb = (Button) findViewById(R.id.pirosGomb);
        zoldGomb = (Button) findViewById(R.id.zoldGomb);

    }
}
