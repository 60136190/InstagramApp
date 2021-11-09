package thainam.instagramapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class ProfileFragment extends Fragment {

    ImageButton imageButton ;
    ImageButton imageButtonAdd ;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.fragmen_profile,container,false);
      imageButton = view.findViewById(R.id.imbtn_menu);
      imageButtonAdd = view.findViewById(R.id.imbtn_add);
      imageButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              clickOpenBottomSheetDialog();

          }
      });
      imageButtonAdd.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              clickOpenBottomSheetDialogAdd();
          }
      });
      return view;
    }


    private void clickOpenBottomSheetDialog() {
        View viewdialog = getLayoutInflater().inflate(R.layout.layout_bottom_sheet,null);

        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(getActivity());
        bottomSheetDialog.setContentView(viewdialog);
        bottomSheetDialog.show();

        TextView set;
        set = viewdialog.findViewById(R.id.setting);
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity3.class);
                startActivity(intent);

            }
        });


    }
    private void clickOpenBottomSheetDialogAdd() {
        View viewdialogadd = getLayoutInflater().inflate(R.layout.layout_bottom_sheet_add,null);

        BottomSheetDialog bottomSheetDialogadd = new BottomSheetDialog(getActivity());
        bottomSheetDialogadd.setContentView(viewdialogadd);
        bottomSheetDialogadd.show();
    }
}
