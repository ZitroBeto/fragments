package com.uaa.fragments;

import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;

/**
 * Created by Robert on 07/10/2015.
 */
public class FragmentLandscape extends Fragment {

    //los fragmentos tienen su propio ciclo de vida al igual que las actividades

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        //se inflará el layout "landcape_fragment". El fragmento tendrá como UI este layout
        return inflater.inflate(R.layout.landscape_fragment,container,false);

    }
}
