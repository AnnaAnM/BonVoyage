package ru.asolovyeva.bonvoyage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class StartFragment extends Fragment {
    private static final String DIALOG_CATEGORY = "DialogCategory";

    private ImageView playButton;

    public static StartFragment newInstance(){
        return new StartFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState){
        View view = layoutInflater.inflate(R.layout.fragment_start, container, false);

        playButton = (ImageView) view.findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                CategoryDialogFragment categoryDialogFragment = new CategoryDialogFragment();
                categoryDialogFragment.show(fragmentManager, DIALOG_CATEGORY);
            }
        });

        return view;
    }
}
