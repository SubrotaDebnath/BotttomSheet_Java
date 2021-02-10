package subrota.shuvro.botttomsheet_java;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class PersistentBottomSheet extends AppCompatActivity {

    private TextView state;
    private BottomSheetBehavior bottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persistent_bottom_sheet);

        state = findViewById(R.id.stateInfo);

        View bottomSheet = findViewById(R.id.persistentBottomSheet);
        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);

        //Here I can set bottom sheet initial state like commended line below
        //bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HALF_EXPANDED);

        bottomSheetBehavior.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(View bottomSheet, int newState) {
                switch(newState){
                    case BottomSheetBehavior.STATE_HALF_EXPANDED:
                        state.setText("Half Expanded");
                        break;

                    case BottomSheetBehavior.STATE_EXPANDED:
                        state.setText("Expanded");
                        break;

                    case BottomSheetBehavior.STATE_COLLAPSED:
                        state.setText("Collapsed");
                        break;

                    case BottomSheetBehavior.STATE_HIDDEN:
                        state.setText("Hidden");
                        break;

                    case BottomSheetBehavior.STATE_DRAGGING:
                        state.setText("Dragging...");
                        break;

                    case BottomSheetBehavior.STATE_SETTLING:
                        state.setText("Settling...");
                        break;

                }
            }

            @Override
            public void onSlide(View bottomSheet, float slideOffset) {
                state.setText("Sliding...");
            }
        });
    }

    public void show(View view) {
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
    }

    public void hide(View view) {
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
    }
}