package gop.akiladeshwar.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void respondToButtonClick(View view){

        Button button = (Button) view;
        Toast.makeText(this,"Launch App: "+button.getText().toString(),Toast.LENGTH_SHORT).show();

    }

}
