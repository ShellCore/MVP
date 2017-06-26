package com.shellcore.android.mvp;

/**
 * Created by Cesar on 26/06/2017.
 */

public interface LoginModel {

    interface OnLoginFinishedListener {

        void onCanceled();

        void onPasswordError();

        void onSuccess();

    }

    void login(String userName, String password, OnLoginFinishedListener listener);

}
