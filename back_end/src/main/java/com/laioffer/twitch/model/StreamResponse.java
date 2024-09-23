package com.laioffer.twitch.model;

import com.laioffer.twitch.external.model.Stream;

import java.util.List;


public record StreamResponse(
        List<Stream> data
) {
}
