/*
AUTHOR:
DATE:
ASSIGNMENT:
 */

/*
I AM POOR PART 5
Continuation of part 4. For this app, you will create a app with the following requirements:
-use a constraint layout

LAYOUT:
-TextView at the top of the screen
-Linear Layout (horizontal):
    -2 buttons, I AM RICH and I AM POOR, that are:
        -equal distance from each other
        -equal distance to the edges of the screen
        -centered text
        -TIP: USE GRAVITY TO CENTER and the View XML code we went over in class
-ImageView at the bottom of the screen

APP BEHAVIOUR:
-When user presses the I AM RICH button:
    -the text will change to "I AM RICH"
    -the image will change to a diamond
-When user presses the I AM POOR button:
    -the text will change to "I AM POOR"
    -the image will change to a coal

CODE:
-create a new method called verifyRichness(Button button) that does the following:
    -takes a button as an argument
    -checks the text of the button (TIP: use .getText() and don't forget to cast!)
    -makes the appropriate appearance changes (text and image)

 */

package com.example.iampoorpart5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verifyRichness(Button button) {

    }

    }