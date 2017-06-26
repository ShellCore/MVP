package com.shellcore.android.mvp;

/**
 * Created by Cesar on 26/06/2017.
 */

public interface LoginView {

    void showProgress(boolean showProgress);

    void setUserNameError(int messageResId);

    void setPasswordError(int messageResId);

    void successAction();
}
