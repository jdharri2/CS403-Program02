package jdharri2.example.com.program2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MonsterDetailFragment extends Fragment {
    private long monsterId;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            monsterId = savedInstanceState.getLong("monsterId");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_monster_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Monster monster = Monster.monsters[(int) monsterId];
            title.setText(monster.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(monster.getDescription());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("monsterId", monsterId);
    }

    public void setMonster(long id) {
        this.monsterId = id;
    }
}

