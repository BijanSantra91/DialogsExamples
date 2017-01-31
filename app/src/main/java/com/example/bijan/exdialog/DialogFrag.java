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
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class DialogFrag extends DialogFragment {


    public DialogFrag() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d = null;

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle("Welcome First DIalog");
        builder.setMessage("Welcome to 1st Dialog");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Kaj korche", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Bondho hobe", Toast.LENGTH_SHORT).show();
                getActivity().finish();
            }
        });

        d = builder.create();

        return d;
    }
}
