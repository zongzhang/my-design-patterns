package com.zz.daili;

import java.util.HashMap;

/**
 * @since 1.0
 */
public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
