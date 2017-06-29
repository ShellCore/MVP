package com.shellcore.android.mvp;

import android.app.Application;

import com.shellcore.android.mvp.lib.GlideImageLoader;
import com.shellcore.android.mvp.lib.ImageLoader;

/**
 * Created by Cesar on 29/06/2017.
 */

public class MVPApplication extends Application {

    private ImageLoader imageLoader;

    @Override
    public void onCreate() {
        super.onCreate();
        setupImageLoader();
    }

    private void setupImageLoader() {
        imageLoader = new GlideImageLoader(this);
    }

    public ImageLoader getImageLoader() {
        return imageLoader;
    }
}
