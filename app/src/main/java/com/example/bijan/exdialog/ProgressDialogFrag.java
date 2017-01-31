package com.example.bijan.exdialog;


import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProgressDialogFrag extends DialogFrag {


    ProgressDialog progressDialog;

    public ProgressDialogFrag() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d = null;

        progressDialog = new ProgressDialog(getActivity());

        progressDialog.setIcon(R.mipmap.ic_launcher);
        progressDialog.setTitle("Uploading");
        progressDialog.setMessage("2 to 10 imagers uploaded");
        //progressDialog.setProgress(20);
        progressDialog.setProgressStyle(1);


        d = progressDialog;

        return  d;
    }

    public  void onResume(){
        super.onResume();

        progressDialog.setProgress(20);
    }
}
