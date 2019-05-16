package tsubasa.csie.example.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    private Button mButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = (Button) findViewById(R.id.myButton1);
        mButton1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick (View v) {

                new AlertDialog.Builder(MainActivity.this).
                        setTitle(R.string.app_about).
                        setMessage(R.string.app_about_msg).
                        setPositiveButton(R.string.str_ok, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();}

        });



    }


}

