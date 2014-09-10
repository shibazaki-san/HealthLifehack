package myapplication.example.com.healthlifehack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Donna on 9/7/2014.
 */
public class Presc extends ActionBarActivity{

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE" ;
    public static final String EXTRB_MESSAGE = "com.example.myfirstapp.MESSAGE" ;
    public static final String EXTRC_MESSAGE = "com.example.myfirstapp.MESSAGE" ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presc);


    }

    public void sendMessage(View view) {
        // Do something in response to button

        Button btnPresc = (Button)findViewById(R.id.doneButton);
        btnPresc.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg)
            {
        Intent intent = new Intent(Presc.this, Notif.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String message2 = editText2.getText().toString();
        intent.putExtra(EXTRB_MESSAGE, message2);
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        String message3 = editText3.getText().toString();
        intent.putExtra(EXTRC_MESSAGE, message3);

        startActivity(intent);
    }
    });

    }
}
