package com.example.securityappprototype.ui.recordings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.securityappprototype.R;

public class RecordingsFragment extends Fragment {

    TextView cText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_recordings, container, false);

        cText = root.findViewById(R.id.text_recordings);

        cText.setText("Recordings Fragment");
        return root;

    }
}
