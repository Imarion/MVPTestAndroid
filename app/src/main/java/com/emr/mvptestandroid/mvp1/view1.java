package com.emr.mvptestandroid.mvp1;

import android.app.Fragment;
//import android.support.v7.app.
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.emr.mvptestandroid.R;

/**
 * Created by emr on 2016/12/06.
 */

public class view1 extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View v = inflater.inflate(R.layout.mvpv1, container, false);

        return v;
    }

}
