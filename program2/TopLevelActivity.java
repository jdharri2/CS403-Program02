package jdharri2.example.com.program2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends Activity {
    private ShareActionProvider shareActionProvider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        //Create an OnItemClickListener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> listView,
                                            View itemView,
                                            int position,
                                            long id) {
                        if (position == 0) {
                            Intent intent = new Intent(TopLevelActivity.this,
                                    MainActivity.class);
                            startActivity(intent);
                        }
                        if (position == 1){
                            Intent intent = new Intent(TopLevelActivity.this,
                                    MainActivity2.class);
                            startActivity(intent);
                        }
                        if (position == 2){
                            Intent intent = new Intent(TopLevelActivity.this,
                                    MainActivity3.class);
                            startActivity(intent);
                        }
                    }
                };

        //Add the listener to the list view
        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}