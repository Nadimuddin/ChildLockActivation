package com.bridgelabz.buttonsview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button childLockButton;

    //creating object of Dialog box
    DialogFragment dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        childLockButton = (Button)findViewById(R.id.childLock);
        childLockButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        dialog = new DialogFragment(this);

        //show the dialog
        dialog.show();
    }
}