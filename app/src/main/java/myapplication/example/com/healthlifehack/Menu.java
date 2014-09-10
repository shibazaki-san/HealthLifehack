package myapplication.example.com.healthlifehack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


/**
 * Created by Donna on 9/6/2014.
 */
public class Menu extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arch);

        addButtonClickListener();

    }

    public void addButtonClickListener()
    {
        Button btnNavigator = (Button)findViewById(R.id.heartButton);
        btnNavigator.setOnClickListener(new OnClickListener(){
            public void onClick(View arg)
            {
                Intent intent = new Intent(Menu.this, MenuInf.class);
                startActivity(intent);
            }
        });
        Button btnNavigator2 = (Button)findViewById(R.id.panicButton);
        btnNavigator2.setOnClickListener(new OnClickListener(){
            public void onClick(View arg)
            {
                Intent intent = new Intent(Menu.this, MenuInfPanic.class);
                startActivity(intent);
            }
        });
        Button btnNavigator3 = (Button)findViewById(R.id.seiButton);
        btnNavigator3.setOnClickListener(new OnClickListener(){
            public void onClick(View arg)
            {
                Intent intent = new Intent(Menu.this, MenuInfSeizure.class);
                startActivity(intent);
            }
        });
        Button btnNavigator4 = (Button)findViewById(R.id.miscButton);
        btnNavigator4.setOnClickListener(new OnClickListener(){
            public void onClick(View arg)
            {
                Intent intent = new Intent(Menu.this, MenuInfMisc.class);
                startActivity(intent);
            }
        });
    }


}
