package ru.asolovyeva.bonvoyage;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;


public class CategoryDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        View view = LayoutInflater.from(getActivity())
                .inflate(R.layout.fragment_dialoalog_category, null);

        return new AlertDialog.Builder(getActivity())
                .setView(view)
                .create();
    }
}
