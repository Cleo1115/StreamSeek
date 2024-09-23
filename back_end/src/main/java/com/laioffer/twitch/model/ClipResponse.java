package com.laioffer.twitch.model;


import com.laioffer.twitch.external.model.Clip;

import java.util.List;


public record ClipResponse(
        List<Clip> data
) {
}
