package myapplication.example.com.healthlifehack;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Donna on 9/7/2014.
 */
public class Notif extends ActionBarActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notif);

//        // Get the message from the intent
//        Intent intent = getIntent();
//        String message = intent.getStringExtra(Presc.EXTRA_MESSAGE);
//
//        // Create the text view
//        TextView textView = new TextView(this);
//        textView.setTextSize(40);
//        textView.setText(message);
//
//        // Set the text view as the activity layout
//        setContentView(textView);
//
//        // Get the message from the intent
//
//        String message2 = intent.getStringExtra(Presc.EXTRB_MESSAGE);
//
//        // Create the text view
//        TextView textView2 = new TextView(this);
//        textView2.setTextSize(40);
//        textView.setText(message2);
//
//        // Set the text view as the activity layout
//        setContentView(textView);
//
//        String message3 = intent.getStringExtra(Presc.EXTRC_MESSAGE);
//
//        // Create the text view
//        TextView textView3 = new TextView(this);
//        textView3.setTextSize(40);
//        textView.setText(message3);

        addAddButtonListener();
    }

    public void addAddButtonListener() {
        Button btnPresc = (Button)findViewById(R.id.addButton);
        btnPresc.setOnClickListener(new OnClickListener(){
            public void onClick(View arg)
            {
                Intent intent = new Intent(Notif.this, Presc.class);
                startActivity(intent);
            }
        });
    }
}
