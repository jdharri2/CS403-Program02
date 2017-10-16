package jdharri2.example.com.program2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity1 extends AppCompatActivity {
    public static final String EXTRA_MONSTER_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail1);
        MonsterDetailFragment1 frag = (MonsterDetailFragment1)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int monsterId = (int) getIntent().getExtras().get(EXTRA_MONSTER_ID);
        frag.setMonster(monsterId);
    }
}