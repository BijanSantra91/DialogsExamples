package com.example.bijan.exdialog;


import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class CustomDialog extends DialogFragment{


    public CustomDialog() {
        // Required empty public constructor
    }


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d = null;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle("Gmail");

        View v = getActivity().getLayoutInflater().inflate(R.layout.fragment_custom_dialog, null);

        final EditText et1 = (EditText) v.findViewById(R.id.edittext1);
        EditText et2 = (EditText) v.findViewById(R.id.edittext2);
        CheckBox checkBox = (CheckBox) v.findViewById(R.id.checkbox);

        builder.setView(v);

        builder.setPositiveButton("LOGIN", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "USERNAME " +et1.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("LOGOUT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                getActivity().finish();
            }
        });



        d = builder.create();
        return d;
    }
}
