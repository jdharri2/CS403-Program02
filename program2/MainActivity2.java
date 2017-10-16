package jdharri2.example.com.program2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity2 extends AppCompatActivity implements MonsterListFragment1.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            MonsterDetailFragment1 details = new MonsterDetailFragment1();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setMonster(id);
            ft.replace(R.id.fragment_container, details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        } else {
            Intent intent = new Intent(this, DetailActivity1.class);
            intent.putExtra(DetailActivity1.EXTRA_MONSTER_ID, (int) id);
            startActivity(intent);
        }
    }
}
