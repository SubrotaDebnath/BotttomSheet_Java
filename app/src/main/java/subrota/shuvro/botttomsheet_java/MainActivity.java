package subrota.shuvro.botttomsheet_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Bottom Sheet");
    }

    public void persistentBottomSheet(View view) {

        startActivity(new Intent(MainActivity.this, PersistentBottomSheet.class));
        //finish();

    }

    public void modalBottomSheet(View view) {

        startActivity(new Intent(MainActivity.this, ModalBottomSheet.class));
        //finish();

    }
}