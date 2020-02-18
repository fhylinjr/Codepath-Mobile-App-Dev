package com.example.philip.hellophilip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Philip","Button clicked");
                ((TextView)findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorAccent));
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Philip","Button clicked");
                ((RelativeLayout)findViewById(R.id.rootView)).setBackgroundColor(
                        getResources().getColor(R.color.teal));
    }
}
);

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Philip","Button clicked");
                //((TextView)findViewById(R.id.textView)).setText("Android is Awesome!");
                //grab the text the user inputted
                String newText = ((EditText)findViewById(R.id.editText)).getText().toString();

                //put the text into our text view once the change text button is clicked
                if (TextUtils.isEmpty(newText)){((TextView)findViewById(R.id.textView)).setText("Hello from Philip!");

                }
                else{
                ((TextView)findViewById(R.id.textView)).setText(newText);}
            }
        }
        );
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Philip","Button clicked");
            //reset text color to black
            ((TextView)findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.black));
            //reset background color to colorPrimary
            (findViewById(R.id.rootView)).setBackgroundColor(
                    getResources().getColor(R.color.colorPrimary));
            //reset text to Hello from Philip
            ((TextView)findViewById(R.id.textView)).setText("Hello from Philip!");

            }
        });

    }

}
