package com.shellcore.android.mvp.lib;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Cesar on 29/06/2017.
 */

public interface ImageLoader {
    void load(CircleImageView view, int url);
}
