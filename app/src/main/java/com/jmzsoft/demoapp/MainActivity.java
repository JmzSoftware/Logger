package com.jmzsoft.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.jmzsoft.logger.Logger;

import static com.jmzsoft.logger.Logger.error;
import static com.jmzsoft.logger.Logger.getBuildConfigValue;
import static com.jmzsoft.logger.Logger.info;
import static com.jmzsoft.logger.Logger.out;
import static com.jmzsoft.logger.Logger.verbose;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logger.init(this);

        error("This is an error");
        verbose("This is verbose log");
        info("This is info log");
        out("This is out log");
    }
}
