package com.calculator.android.amr.amrcalc;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    public static Button button0;
    public static Button button1;
    public static Button button2;
    public static Button button3;
    public static Button button4;
    public static Button button5;
    public static Button button6;
    public static Button button7;
    public static Button button8;
    public static Button button9;
    public static Button buttonAdd;
    public static Button buttonMul;
    public static Button buttonSub;
    public static Button buttonDiv;
    public static Button buttonEqual;
    public static Button buttonCE;
    public static Button buttonDot;

    public static TextView myTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        buttonAdd = (Button)findViewById(R.id.buttonAdd);
        buttonMul = (Button)findViewById(R.id.buttonMul);
        buttonSub = (Button)findViewById(R.id.buttonSub);
        buttonDiv = (Button)findViewById(R.id.buttonDiv);
        buttonEqual = (Button)findViewById(R.id.buttonEqual);
        buttonCE = (Button)findViewById(R.id.buttonCE);
        buttonDot = (Button)findViewById(R.id.buttonDot);

        myTextView = (TextView) findViewById(R.id.textView);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText(myTextView.getText()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText(myTextView.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText(myTextView.getText()+"2");            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText(myTextView.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText(myTextView.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText(myTextView.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText(myTextView.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText(myTextView.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText(myTextView.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText(myTextView.getText()+"9");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText(myTextView.getText()+"+");
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText(myTextView.getText()+"-");
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText(myTextView.getText()+"*");
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText(myTextView.getText()+"/");
            }
        });
        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText("");
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText(myTextView.getText()+".");
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText("");
            }
        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
