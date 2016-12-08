package com.emr.mvptestandroid.mvp2;

/**
 * Created by emr on 2016/12/06.
 */

public class presenter2  implements mvp2contract.ProvidedPresenterOperations {

    private static presenter2 pres2;

    private mvp2contract.RequiredViewOperations mRvo;

    public static presenter2 getInstance() {
        if (pres2 == null)
        {
            pres2 = new presenter2();
        }
        return pres2;
    }

    @Override
    public void setView(mvp2contract.RequiredViewOperations rvo) {
        mRvo = rvo;
    }

    @Override
    public mvp2contract.ProvidedPresenterOperations getme() {
        return getInstance();
    }

    @Override
    public void setText(String text) {
        mRvo.setText(text);
    }
}
