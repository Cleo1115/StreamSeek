package com.laioffer.twitch.model;

import com.laioffer.twitch.external.model.Game;

import java.util.List;

public record GameResponse(
        List<Game> data
) {
}
