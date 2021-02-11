package subrota.shuvro.botttomsheet_java;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class ModalBottomSheetDialog extends BottomSheetDialogFragment {

    BottomSheetListener listener ;
    private Button optionA, optionB;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.modal_bottom_sheet, container, false);

        optionA = view.findViewById(R.id.optionA);
        optionB = view.findViewById(R.id.optionB);

        optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onBottomSheetPress("Option A pressed.");
            }
        });

        optionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onBottomSheetPress("Option B pressed.");
            }
        });

        return view;
    }

    public interface BottomSheetListener{
        void onBottomSheetPress(String option);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener = (BottomSheetListener) context;
    }
}
