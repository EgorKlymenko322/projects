package ru.startandroid.develop.pyatnashki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Collections;
import java.util.Arrays;
import android.graphics.Color;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int green = Color.parseColor("#00FF00");
        int red = Color.parseColor("#FF0000");

        Button new_game = findViewById(R.id.new_game);
        Button undo = findViewById(R.id.undo);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);
        Button button12 = findViewById(R.id.button12);
        Button button13 = findViewById(R.id.button13);
        Button button14 = findViewById(R.id.button14);
        Button button15 = findViewById(R.id.button15);
        Button button16 = findViewById(R.id.button16);

///////////////////////////////////////////////NEW_GAME
        new_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                undo.setClickable(false);
                undo.setActivated(false);
                Integer[] numbers = new Integer[16];
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = i;
                }
                Collections.shuffle(Arrays.asList(numbers));
                if (numbers[0] == 0) {
                    button1.setText("");
                    button1.setBackgroundColor(red);
                } else {
                    button1.setText("" + numbers[0]);
                    button1.setBackgroundColor(green);
                }
                if (numbers[1] == 0) {
                    button2.setText("");
                    button2.setBackgroundColor(red);
                } else {
                    button2.setText("" + numbers[1]);
                    button2.setBackgroundColor(green);
                }
                if (numbers[2] == 0) {
                    button3.setText("");
                    button3.setBackgroundColor(red);
                } else {
                    button3.setText("" + numbers[2]);
                    button3.setBackgroundColor(green);
                }
                if (numbers[3] == 0) {
                    button4.setText("");
                    button4.setBackgroundColor(red);
                } else {
                    button4.setText("" + numbers[3]);
                    button4.setBackgroundColor(green);
                }
                if (numbers[4] == 0) {
                    button5.setText("");
                    button5.setBackgroundColor(red);
                } else {
                    button5.setText("" + numbers[4]);
                    button5.setBackgroundColor(green);
                }
                if (numbers[5] == 0) {
                    button6.setText("");
                    button6.setBackgroundColor(red);
                } else {
                    button6.setText("" + numbers[5]);
                    button6.setBackgroundColor(green);
                }
                if (numbers[6] == 0) {
                    button7.setText("");
                    button7.setBackgroundColor(red);
                } else {
                    button7.setText("" + numbers[6]);
                    button7.setBackgroundColor(green);
                }
                if (numbers[7] == 0) {
                    button8.setText("");
                    button8.setBackgroundColor(red);
                } else {
                    button8.setText("" + numbers[7]);
                    button8.setBackgroundColor(green);
                }
                if(numbers[8]==0) {
                    button9.setText("");
                    button9.setBackgroundColor(red);
                }
                else {
                    button9.setText("" + numbers[8]);
                    button9.setBackgroundColor(green);
                }
                if(numbers[9]==0) {
                    button10.setText("");
                    button10.setBackgroundColor(red);
                }
                else {
                    button10.setText("" + numbers[9]);
                    button10.setBackgroundColor(green);
                }
                if(numbers[10]==0) {
                    button11.setText("");
                    button11.setBackgroundColor(red);
                }
                else {
                    button11.setText("" + numbers[10]);
                    button11.setBackgroundColor(green);
                }
                if(numbers[11]==0) {
                    button12.setText("");
                    button12.setBackgroundColor(red);
                }
                else {
                    button12.setText("" + numbers[11]);
                    button12.setBackgroundColor(green);
                }
                if(numbers[12]==0) {
                    button13.setText("");
                    button13.setBackgroundColor(red);
                }
                else {
                    button13.setText("" + numbers[12]);
                    button13.setBackgroundColor(green);
                }
                if(numbers[13]==0) {
                    button14.setText("");
                    button14.setBackgroundColor(red);
                }
                else {
                    button14.setText("" + numbers[13]);
                    button14.setBackgroundColor(green);
                }
                if(numbers[14]==0) {
                    button15.setText("");
                    button15.setBackgroundColor(red);
                }
                else {
                    button15.setText("" + numbers[14]);
                    button15.setBackgroundColor(green);
                }
                if(numbers[15]==0) {
                    button16.setText("");
                    button16.setBackgroundColor(red);
                }
                else {
                    button16.setText("" + numbers[15]);
                    button16.setBackgroundColor(green);
                }
            }
        });


        ///////////////////////////UNDO
        undo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ///////////////////////////button1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button1.getText()!="" && button2.getText()=="")
                {
                    button2.setText(button1.getText());
                    button2.setBackgroundColor(green);
                    button1.setText("");
                    button1.setBackgroundColor(red);
                }
                if(button1.getText()!="" && button5.getText()=="")
                {
                    button5.setText(button1.getText());
                    button5.setBackgroundColor(green);
                    button1.setText("");
                    button1.setBackgroundColor(red);
                }
            }
        });

        ///////////////////////////button2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button2.getText()!="" && button1.getText()=="")
                {
                    button1.setText(button2.getText());
                    button1.setBackgroundColor(green);
                    button2.setText("");
                    button2.setBackgroundColor(red);
                }
                if(button2.getText()!="" && button3.getText()=="")
                {
                    button3.setText(button2.getText());
                    button3.setBackgroundColor(green);
                    button2.setText("");
                    button2.setBackgroundColor(red);
                }
                if(button2.getText()!="" && button6.getText()=="")
                {
                    button6.setText(button2.getText());
                    button6.setBackgroundColor(green);
                    button2.setText("");
                    button2.setBackgroundColor(red);
                }
            }
        });

        ///////////////////////////button3
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button3.getText()!="" && button2.getText()=="")
                {
                    button2.setText(button3.getText());
                    button2.setBackgroundColor(green);
                    button3.setText("");
                    button3.setBackgroundColor(red);
                }
                if(button3.getText()!="" && button4.getText()=="")
                {
                    button4.setText(button3.getText());
                    button4.setBackgroundColor(green);
                    button3.setText("");
                    button3.setBackgroundColor(red);
                }
                if(button3.getText()!="" && button7.getText()=="")
                {
                    button7.setText(button3.getText());
                    button7.setBackgroundColor(green);
                    button3.setText("");
                    button3.setBackgroundColor(red);
                }
            }
        });

        ///////////////////////////button4
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button4.getText()!="" && button3.getText()=="")
                {
                    button3.setText(button4.getText());
                    button3.setBackgroundColor(green);
                    button4.setText("");
                    button4.setBackgroundColor(red);
                }
                if(button4.getText()!="" && button8.getText()=="")
                {
                    button8.setText(button4.getText());
                    button8.setBackgroundColor(green);
                    button4.setText("");
                    button4.setBackgroundColor(red);
                }
            }
        });

        ///////////////////////////button5
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button5.getText()!="" && button1.getText()=="")
                {
                    button1.setText(button5.getText());
                    button1.setBackgroundColor(green);
                    button5.setText("");
                    button5.setBackgroundColor(red);
                }
                if(button5.getText()!="" && button6.getText()=="")
                {
                    button6.setText(button5.getText());
                    button6.setBackgroundColor(green);
                    button5.setText("");
                    button5.setBackgroundColor(red);
                }
                if(button5.getText()!="" && button9.getText()=="")
                {
                    button9.setText(button5.getText());
                    button9.setBackgroundColor(green);
                    button5.setText("");
                    button5.setBackgroundColor(red);
                }
            }
        });

        ///////////////////////////button6
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button6.getText()!="" && button2.getText()=="")
                {
                    button2.setText(button6.getText());
                    button2.setBackgroundColor(green);
                    button6.setText("");
                    button6.setBackgroundColor(red);
                }
                if(button6.getText()!="" && button5.getText()=="")
                {
                    button5.setText(button6.getText());
                    button5.setBackgroundColor(green);
                    button6.setText("");
                    button6.setBackgroundColor(red);
                }
                if(button6.getText()!="" && button7.getText()=="")
                {
                    button7.setText(button6.getText());
                    button7.setBackgroundColor(green);
                    button6.setText("");
                    button6.setBackgroundColor(red);
                }
                if(button6.getText()!="" && button10.getText()=="")
                {
                    button10.setText(button6.getText());
                    button10.setBackgroundColor(green);
                    button6.setText("");
                    button6.setBackgroundColor(red);
                }
            }
        });

        ///////////////////////////button7
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button7.getText()!="" && button3.getText()=="")
                {
                    button3.setText(button7.getText());
                    button3.setBackgroundColor(green);
                    button7.setText("");
                    button7.setBackgroundColor(red);
                }
                if(button7.getText()!="" && button6.getText()=="")
                {
                    button6.setText(button7.getText());
                    button6.setBackgroundColor(green);
                    button7.setText("");
                    button7.setBackgroundColor(red);
                }
                if(button7.getText()!="" && button8.getText()=="")
                {
                    button8.setText(button7.getText());
                    button8.setBackgroundColor(green);
                    button7.setText("");
                    button7.setBackgroundColor(red);
                }
                if(button7.getText()!="" && button11.getText()=="")
                {
                    button11.setText(button7.getText());
                    button11.setBackgroundColor(green);
                    button7.setText("");
                    button7.setBackgroundColor(red);
                }
            }
        });

        ///////////////////////////button8
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button8.getText()!="" && button4.getText()=="")
                {
                    button4.setText(button8.getText());
                    button4.setBackgroundColor(green);
                    button8.setText("");
                    button8.setBackgroundColor(red);
                }
                if(button8.getText()!="" && button7.getText()=="")
                {
                    button7.setText(button8.getText());
                    button7.setBackgroundColor(green);
                    button8.setText("");
                    button8.setBackgroundColor(red);
                }
                if(button8.getText()!="" && button12.getText()=="")
                {
                    button12.setText(button8.getText());
                    button12.setBackgroundColor(green);
                    button8.setText("");
                    button8.setBackgroundColor(red);
                }
            }
        });

        ///////////////////////////button9
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button9.getText()!="" && button5.getText()=="")
                {
                    button5.setText(button9.getText());
                    button5.setBackgroundColor(green);
                    button9.setText("");
                    button9.setBackgroundColor(red);
                }
                if(button9.getText()!="" && button10.getText()=="")
                {
                    button10.setText(button9.getText());
                    button10.setBackgroundColor(green);
                    button9.setText("");
                    button9.setBackgroundColor(red);
                }
                if(button9.getText()!="" && button13.getText()=="")
                {
                    button13.setText(button9.getText());
                    button13.setBackgroundColor(green);
                    button9.setText("");
                    button9.setBackgroundColor(red);
                }
            }
        });

        ///////////////////////////button10
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button10.getText()!="" && button6.getText()=="")
                {
                    button6.setText(button10.getText());
                    button6.setBackgroundColor(green);
                    button10.setText("");
                    button10.setBackgroundColor(red);
                }
                if(button10.getText()!="" && button9.getText()=="")
                {
                    button9.setText(button10.getText());
                    button9.setBackgroundColor(green);
                    button10.setText("");
                    button10.setBackgroundColor(red);
                }
                if(button10.getText()!="" && button11.getText()=="")
                {
                    button11.setText(button10.getText());
                    button11.setBackgroundColor(green);
                    button10.setText("");
                    button10.setBackgroundColor(red);
                }
                if(button10.getText()!="" && button14.getText()=="")
                {
                    button14.setText(button10.getText());
                    button14.setBackgroundColor(green);
                    button10.setText("");
                    button10.setBackgroundColor(red);
                }
            }
        });

        ///////////////////////////button11
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button11.getText()!="" && button7.getText()=="")
                {
                    button7.setText(button11.getText());
                    button7.setBackgroundColor(green);
                    button11.setText("");
                    button11.setBackgroundColor(red);
                }
                if(button11.getText()!="" && button10.getText()=="")
                {
                    button10.setText(button11.getText());
                    button10.setBackgroundColor(green);
                    button11.setText("");
                    button11.setBackgroundColor(red);
                }
                if(button11.getText()!="" && button12.getText()=="")
                {
                    button12.setText(button11.getText());
                    button12.setBackgroundColor(green);
                    button11.setText("");
                    button11.setBackgroundColor(red);
                }
                if(button11.getText()!="" && button15.getText()=="")
                {
                    button15.setText(button11.getText());
                    button15.setBackgroundColor(green);
                    button11.setText("");
                    button11.setBackgroundColor(red);
                }
            }
        });

        ///////////////////////////button12
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button12.getText()!="" && button8.getText()=="")
                {
                    button8.setText(button12.getText());
                    button8.setBackgroundColor(green);
                    button12.setText("");
                    button12.setBackgroundColor(red);
                }
                if(button12.getText()!="" && button11.getText()=="")
                {
                    button11.setText(button12.getText());
                    button11.setBackgroundColor(green);
                    button12.setText("");
                    button12.setBackgroundColor(red);
                }
                if(button12.getText()!="" && button16.getText()=="")
                {
                    button16.setText(button12.getText());
                    button16.setBackgroundColor(green);
                    button12.setText("");
                    button12.setBackgroundColor(red);
                }
            }
        });

        ///////////////////////////button13
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button13.getText()!="" && button9.getText()=="")
                {
                    button9.setText(button13.getText());
                    button9.setBackgroundColor(green);
                    button13.setText("");
                    button13.setBackgroundColor(red);
                }
                if(button13.getText()!="" && button14.getText()=="")
                {
                    button14.setText(button13.getText());
                    button14.setBackgroundColor(green);
                    button13.setText("");
                    button13.setBackgroundColor(red);
                }
            }
        });

        ///////////////////////////button14
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button14.getText()!="" && button10.getText()=="")
                {
                    button10.setText(button14.getText());
                    button10.setBackgroundColor(green);
                    button14.setText("");
                    button14.setBackgroundColor(red);
                }
                if(button14.getText()!="" && button13.getText()=="")
                {
                    button13.setText(button14.getText());
                    button13.setBackgroundColor(green);
                    button14.setText("");
                    button14.setBackgroundColor(red);
                }
                if(button14.getText()!="" && button15.getText()=="")
                {
                    button15.setText(button14.getText());
                    button15.setBackgroundColor(green);
                    button14.setText("");
                    button14.setBackgroundColor(red);
                }
            }
        });

        ///////////////////////////button15
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button15.getText()!="" && button11.getText()=="")
                {
                    button11.setText(button15.getText());
                    button11.setBackgroundColor(green);
                    button15.setText("");
                    button15.setBackgroundColor(red);
                }
                if(button15.getText()!="" && button14.getText()=="")
                {
                    button14.setText(button15.getText());
                    button14.setBackgroundColor(green);
                    button15.setText("");
                    button15.setBackgroundColor(red);
                }
                if(button15.getText()!="" && button16.getText()=="")
                {
                    button16.setText(button15.getText());
                    button16.setBackgroundColor(green);
                    button15.setText("");
                    button15.setBackgroundColor(red);
                }
            }
        });

        ///////////////////////////button16
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button16.getText()!="" && button12.getText()=="")
                {
                    button12.setText(button16.getText());
                    button12.setBackgroundColor(green);
                    button16.setText("");
                    button16.setBackgroundColor(red);
                }
                if(button16.getText()!="" && button15.getText()=="")
                {
                    button15.setText(button16.getText());
                    button15.setBackgroundColor(green);
                    button16.setText("");
                    button16.setBackgroundColor(red);
                }
            }
        });
    }//end onCreate

    @Override
    protected void onResume() {
        super.onResume();
        //System.out.println("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        //System.out.println("onPause");
    }
}
