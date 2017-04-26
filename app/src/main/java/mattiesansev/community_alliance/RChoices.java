package mattiesansev.community_alliance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RChoices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rchoices);

        //display choices from database (incomplete)


    }
    public void onSelect(View v){
        Intent i = new Intent(RChoices.this, Starbucks.class);
        startActivity(i);
    }
    public void toStudentTest(View v){
        Intent i = new Intent(RChoices.this, StudentTest.class);
        startActivity(i);
    }
}