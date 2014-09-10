package myapplication.example.com.healthlifehack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Donna on 9/7/2014.
 */
public class MenuInf extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infographic);

        addButtonClickListener();
    }

    public void addButtonClickListener() {
        Button btnNavigator = (Button) findViewById(R.id.button);
        btnNavigator.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg) {
                Intent intent = new Intent(MenuInf.this, myapplication.example.com.healthlifehack.Infograph.class);
                startActivity(intent);
            }
        });
        Button btnNavigator1 = (Button) findViewById(R.id.button2);
        btnNavigator1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg) {
                Intent intent = new Intent(MenuInf.this, myapplication.example.com.healthlifehack.Infograph.class);
                startActivity(intent);
            }
        });
        Button btnNavigator2 = (Button) findViewById(R.id.button3);
        btnNavigator2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg) {
                Intent intent = new Intent(MenuInf.this, myapplication.example.com.healthlifehack.Infograph.class);
                startActivity(intent);
            }
        });
        Button btnNavigator3 = (Button) findViewById(R.id.button4);
        btnNavigator3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg) {
                Intent intent = new Intent(MenuInf.this, myapplication.example.com.healthlifehack.Infograph.class);
                startActivity(intent);
            }
        });

    }
}
