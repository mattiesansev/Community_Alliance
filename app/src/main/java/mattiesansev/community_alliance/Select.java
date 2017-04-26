package mattiesansev.community_alliance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Select extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
    }
    public void toRChoices (View v){
        Intent i = new Intent (Select.this, RChoices.class);
        startActivity(i);
    }
}
