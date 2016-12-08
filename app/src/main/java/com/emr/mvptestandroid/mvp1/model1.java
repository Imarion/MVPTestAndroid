package com.emr.mvptestandroid.mvp1;

import android.util.Log;

/**
 * Created by emr on 2016/12/06.
 */

public class model1 implements mvp1contract.ProvidedModelOperations {

    String mS;

    public model1() {
        Log.d ("model1"," instantiated");
    }

    @Override
    public void saveText(String s) {
        mS = s;
    }
}
