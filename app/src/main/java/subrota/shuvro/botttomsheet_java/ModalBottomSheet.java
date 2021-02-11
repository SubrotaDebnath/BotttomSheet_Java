package subrota.shuvro.botttomsheet_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ModalBottomSheet extends AppCompatActivity implements ModalBottomSheetDialog.BottomSheetListener {

    private TextView state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modal_bottom_sheet);

        setTitle("Modal BottomSheet");

        state = findViewById(R.id.stateChangeTV);
    }

    public void showModalBottomSheet(View view) {
        ModalBottomSheetDialog dialog = new ModalBottomSheetDialog();
        dialog.show(getSupportFragmentManager(), "bottomSheet");
    }

    @Override
    public void onBottomSheetPress(String option) {
        state.setText(option);
    }
}