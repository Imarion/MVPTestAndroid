package com.emr.mvptestandroid.mvp1;

/**
 * Created by emr on 2016/12/06.
 */

public class model1 implements mvp1contract.ProvidedModelOperations {

    String mS;

    @Override
    public void saveText(String s) {
        mS = s;
    }
}
