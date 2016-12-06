package com.emr.mvptestandroid.mvp1;

import android.text.TextWatcher;

/**
 * Created by emr on 2016/12/06.
 */

public interface mvp1contract {

    interface ProvidedPresenterOperations {
        public void setView(mvp1contract.RequiredViewOperations rvo);
    }

    interface ProvidedModelOperations {
        public void saveText(String s);
    }

    interface RequiredViewOperations {

    }
}
