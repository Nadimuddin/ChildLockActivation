package com.bridgelabz.buttonsview;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by Nadimuddin on 17/8/16.
 */
public class DialogFragment extends Dialog implements View.OnClickListener
{
    private static final String TAG="DialogFragment";
    Button button[] = new Button[9];

    //array of 3 random numbers
    int arr[] = new int[3];
    int i,count=0;

    /*byte to check the status of buttons
    * whether they are pressed or released
    * if pressed byte will be 1
    * if released byte will be 0*/
    byte b[] = new byte[9];

    //to display 3 random numbers
    TextView num[] = new TextView[3];

    DialogFragment object;
    public DialogFragment(Activity a)
    {
        super(a);
    }
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        button[0] = (Button)findViewById(R.id.button1);
        button[1] = (Button)findViewById(R.id.button2);
        button[2] = (Button)findViewById(R.id.button3);
        button[3] = (Button)findViewById(R.id.button4);
        button[4] = (Button)findViewById(R.id.button5);
        button[5] = (Button)findViewById(R.id.button6);
        button[6] = (Button)findViewById(R.id.button7);
        button[7] = (Button)findViewById(R.id.button8);
        button[8] = (Button)findViewById(R.id.button9);

       for(i=0;i<button.length; i++)
            button[i].setOnClickListener(this);

        num[0] = (TextView)findViewById(R.id.num1);
        num[1] = (TextView)findViewById(R.id.num2);
        num[2] = (TextView)findViewById(R.id.num3);

        /*while loop to check that
        * generated random numbers should not be repeated
        * and should be greater than zero
        * */
        while (arr[0]==arr[1] || arr[0]==arr[2] || arr[1] == arr[2] || arr[0]<=0 || arr[1]<=0 || arr[2]<=0)
        {
            for(i=0; i<3; i++)
            {
                arr[i] = randomNumberGeneration(9,1);
            }
        }

        /*loop to convert integer random number into alphabetical form
        * and print it on the TextView
        * */
            for(i=0; i<arr.length; i++)
        num[i].setText(findNumber(arr[i]));
    }

    /*method to take object of DialogFragment class
    * this object can be further use to close this dialog*/
    void passingObject(DialogFragment object)
    {
        this.object = object;
        Log.i(TAG,"object value in Dialog: "+this.object);
    }

    //change view of button when it is pressed
    void buttonPressed(int n)
    {
        button[n].setBackgroundResource(R.drawable.shape_for_press);
    }

    //change view of button when it is released
    void buttonReleased(int n)
    {
        button[n].setBackgroundResource(R.drawable.shape_for_release);
    }

    //method to generate 3 random numbers
    int randomNumberGeneration(int max, int min)
    {
        Random rn = new Random();
        int a = max - min +1;
        int b = rn.nextInt() % a;
        int randNum = min+b;
        return randNum;
    }

    //method to convert integer random number into it's alphabetical form
    String findNumber(int n)
    {
        String str=null;
        if(n==1)
            str = "ONE";
        else if(n==2)
            str = "TWO";
        else if(n==3)
            str = "THREE";
        else if(n==4)
            str = "FOUR";
        else if(n==5)
            str = "FIVE";
        else if(n==6)
            str = "SIX";
        else if(n==7)
            str = "SEVEN";
        else if(n==8)
            str = "EIGHT";
        else if(n==9)
            str = "NINE";
        return str;
    }

    @Override
    public void onClick(View v)
    {
        if(v.getId() == R.id.button1)
        {
            if(b[0] == 0) {
                buttonPressed(0);
                b[0] =1;
                count++;
            }
            else {
                buttonReleased(0);
                b[0] =0;
                count--;
            }
        }
        if(v.getId() == R.id.button2)
        {
            if(b[1]==0) {
                buttonPressed(1);
                b[1]=1;
                count++;
            }
            else {
                buttonReleased(1);
                b[1]=0;
                count--;
            }
        }
        if(v.getId() == R.id.button3)
        {
            if(b[2]==0) {
                buttonPressed(2);
                b[2]=1;
                count++;
            }
            else {
                buttonReleased(2);
                b[2]=0;
                count--;
            }
        }
        if(v.getId() == R.id.button4)
        {
            if(b[3]==0) {
                buttonPressed(3);
                b[3]=1;
                count++;
            }
            else {
                buttonReleased(3);
                b[3]=0;
                count--;
            }
        }
        if(v.getId() == R.id.button5)
        {
            if(b[4]==0) {
                buttonPressed(4);
                b[4]=1;
                count++;
            }
            else {
                buttonReleased(4);
                b[4]=0;
                count--;
            }
        }
        if(v.getId() == R.id.button6)
        {
            if(b[5]==0) {
                buttonPressed(5);
                b[5]=1;
                count++;
            }
            else {
                buttonReleased(5);
                b[5]=0;
                count--;
            }
        }
        if(v.getId() == R.id.button7)
        {
            if(b[6]==0) {
                buttonPressed(6);
                b[6]=1;
                count++;
            }
            else {
                buttonReleased(6);
                b[6]=0;
                count--;
            }
        }
        if(v.getId() == R.id.button8)
        {
            if(b[7]==0) {
                buttonPressed(7);
                b[7]=1;
                count++;
            }
            else {
                buttonReleased(7);
                b[7]=0;
                count--;
            }
        }
        if(v.getId() == R.id.button9)
        {
            if(b[8]==0) {
                buttonPressed(8);
                b[8]=1;
                count++;
            }
            else {
                buttonReleased(8);
                b[8]=0;
                count--;
            }
        }
        if(count == 3)
        {
            Log.i(TAG,"\ncount reached to 3\n");
            authenticationMethod();
        }
    }

    //method to verify authentication
    void authenticationMethod()
    {
        Log.i(TAG,"zero "+arr[0]+"\none "+arr[1]+"\ntwo "+arr[2]);
        Log.i(TAG,"zero "+b[arr[0]-1]+"\none "+b[arr[1]-1]+"\ntwo "+b[arr[2]-1]);

        if(b[arr[0]-1] == 1  && b[arr[1]-1] == 1 && b[arr[2]-1]== 1)
        {
            Toast.makeText(getContext(),"Authenticated",Toast.LENGTH_LONG).show();
            object.dismiss();
            Log.i(TAG,"Authenticated***************");
        }
        else
            resetInput();
    }
    void resetInput()
    {
        Toast.makeText(getContext(), "Wrong Input", Toast.LENGTH_SHORT).show();
        for(i=0; i<b.length; i++)
        {
            button[i].setBackgroundResource(R.drawable.shape_for_release);
            b[i] = 0;
            count = 0;
        }
    }
}