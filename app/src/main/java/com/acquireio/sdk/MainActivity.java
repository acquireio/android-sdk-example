package com.acquireio.sdk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.acquireio.AcquireApp;
import com.acquireio.callbacks.OnSessionEvents;

public class MainActivity extends AppCompatActivity implements OnSessionEvents {

    private        TextView txtSocketStatus;
    private        Button   btnSupport;
    private static boolean  isConnected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        txtSocketStatus = findViewById(R.id.txtSocketStatus);
        btnSupport = findViewById(R.id.btnSupport);
        btnSupport.setEnabled(false);
        try {
            // AcquireApp.getInstance() throws Exception if correct Account id is not provided
            AcquireApp.getInstance().setSessionListner(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        btnSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AcquireApp.getInstance().startSupportChat();
            }
        });
        txtSocketStatus.setText("You are connected with Account Id " + com.acquireio.sdk.MyApp.AccId + ".\nTo" + " start" + " chat click on support.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (isConnected) {
            btnSupport.setEnabled(true);
            btnSupport.setText("Support");
        }
    }

    @Override
    public void onSessionConnected() {
        isConnected = true;
        btnSupport.setEnabled(true);
        btnSupport.setText("Support");
    }

    @Override
    public void onSessionDisconnected(String Reason) {

    }

    @Override
    public void onSessionWaiting() {

    }

    @Override
    public void onChatAlreadyStarted() {

    }

    @Override
    public void onAgentOnline() {

    }

    @Override
    public void onAgentOffline() {

    }

    @Override
    public void onAgentAvailable() {

    }
}
