package com.aserrano.splashandmenu;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        ListView listView = findViewById(R.id.listView);

        String[] array = {
                getResources().getString(R.string.play),
                getResources().getString(R.string.scores),
                getResources().getString(R.string.settings),
                getResources().getString(R.string.help)
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, R.layout.menu_item, array);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView textView = (TextView) view;
                String strText = textView.getText().toString();
                if(strText.equalsIgnoreCase(getResources().getString(R.string.play))){
                    startActivity(new Intent(MainMenu.this, Game.class));
                }else if (strText.equalsIgnoreCase(getResources().getString(R.string.scores))){
                    startActivity(new Intent(MainMenu.this, Game.class));
                }else if (strText.equalsIgnoreCase(getResources().getString(R.string.settings))){
                    startActivity(new Intent(MainMenu.this, Game.class));
                }else if (strText.equalsIgnoreCase(getResources().getString(R.string.help))){
                    startActivity(new Intent(MainMenu.this, Game.class));
                }
            }
        });
    }
}