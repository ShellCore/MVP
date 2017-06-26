package com.shellcore.android.mvp;

import android.text.TextUtils;

/**
 * Created by Cesar on 26/06/2017.
 */

class LoginPresenterImpl implements LoginPresenter {

    private LoginView view;
    private LoginModel model;

    public LoginPresenterImpl(LoginView view) {
        this.view = view;
        model = new LoginModelImpl();
    }

    @Override
    public void validateCredentials(String userName, String password) {
        // Check for a valid password, if the user entered one.
        if (!TextUtils.isEmpty(password) && !isPasswordValid(password)) {
            view.setPasswordError(R.string.error_invalid_password);
            return;
        }
        // Check for a valid email address.
        if (TextUtils.isEmpty(userName)) {
            view.setUserNameError(R.string.error_field_required);
            return;
        } else if (!isEmailValid(userName)) {
            view.setUserNameError(R.string.error_invalid_email);
            return;
        }

        view.showProgress(true);
        model.login(userName, password);

    }

    private boolean isEmailValid(String email) {
        //TODO: Replace this with your own logic
        return email.contains("@");
    }

    private boolean isPasswordValid(String password) {
        //TODO: Replace this with your own logic
        return password.length() > 4;
    }
}
