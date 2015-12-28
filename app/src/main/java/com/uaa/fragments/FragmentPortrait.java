package com.uaa.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Robert on 07/10/2015.
 */
public class FragmentPortrait extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        //se inflará el layout "landcape_fragment". El fragmento tendrá como UI este layout
        return inflater.inflate(R.layout.portrait_fragment,container,false);

    }
}
