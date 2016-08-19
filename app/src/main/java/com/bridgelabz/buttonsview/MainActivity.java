package com.bridgelabz.buttonsview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //creating object of Dialog box
    DialogFragment dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialog = new DialogFragment(this);
        Log.i("TAG","object value in Main: "+dialog);

        /*
        * passing the object of DialogFragment class
        * so that we can close the dialog from DialogFragment class
        * by using the same object
        * */
        dialog.passingObject(dialog);

        //show the dialog
        dialog.show();
    }
}