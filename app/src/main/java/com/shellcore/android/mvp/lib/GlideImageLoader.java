package com.shellcore.android.mvp.lib;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Cesar on 29/06/2017.
 */

public class GlideImageLoader implements ImageLoader {

    private RequestManager requestManager;

    public GlideImageLoader(Context context) {
        requestManager = Glide.with(context);
    }

    @Override
    public void load(CircleImageView view, int url) {
        requestManager.load(url)
                .into(view);
    }
}
