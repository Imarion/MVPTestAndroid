package com.emr.mvptestandroid.mvp2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.emr.mvptestandroid.R;

/**
 * Created by emr on 2016/12/06.
 */

public class view2 extends Fragment implements mvp2contract.RequiredViewOperations {

    private TextView   tv2;
    private presenter2 pres2 = presenter2.getInstance();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View v = inflater.inflate(R.layout.mvpv2, container, false);

        tv2 = (TextView) v.findViewById(R.id.tv2);
        tv2.clearFocus();

        pres2.setView(this);


        return v;
    }

    @Override
    public void setText(String text) {
        tv2.setText(text);
    }
}
