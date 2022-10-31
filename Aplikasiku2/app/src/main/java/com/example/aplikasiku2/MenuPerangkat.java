package com.example.aplikasiku2;

import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MenuPerangkat extends Fragment {

    public static MenuPerangkat newInstance() {return new MenuPerangkat();}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate (R.layout.fragment_menu_perangkat, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        return root;
    }

}

