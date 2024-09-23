package com.laioffer.twitch.model;

import com.laioffer.twitch.external.model.Video;

import java.util.List;

public record VideoResponse(
        List<Video> data
) {
}
