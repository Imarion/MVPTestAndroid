package com.emr.mvptestandroid.mvp1;

import android.text.Editable;
import android.text.TextWatcher;

import com.emr.mvptestandroid.mvp2.presenter2;

/**
 * Created by emr on 2016/12/06.
 */

public class presenter1 implements mvp1contract.ProvidedPresenterOperations, TextWatcher {

    private static presenter1 pres1;
    private        mvp1contract.ProvidedModelOperations    modl1 = new model1();

    private presenter2 pres2 = presenter2.getInstance();

    private mvp1contract.RequiredViewOperations mRvo;

    private presenter1() {

    }

    public static presenter1 getInstance() {
        if (pres1 == null)
        {
            pres1 = new presenter1();
        }
        return pres1;
    }

    @Override
    public void setView(mvp1contract.RequiredViewOperations rvo) {
        mRvo = rvo;
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        modl1.saveText(editable.toString());
        presenter2.getInstance().setText(editable.toString());
    }
}

