package com.emr.mvptestandroid.mvp2;

/**
 * Created by emr on 2016/12/06.
 */

public class mvp2contract {

    interface ProvidedPresenterOperations {
        public void setView(mvp2contract.RequiredViewOperations rvo);
        public ProvidedPresenterOperations getme();
        public void setText(String text);
    }

    interface ProvidedModelOperations {

    }

    interface RequiredViewOperations {
        public void setText(String text);
    }
}
