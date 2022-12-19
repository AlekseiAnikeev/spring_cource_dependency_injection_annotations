package ru.agentche.musicplayer;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 01.12.2022
 */
@Component
public class RockMusic implements Music {
    private final List<String> musicList = new ArrayList<>();

    public RockMusic() {
        musicList.add("Wind cries Mary");
        musicList.add("Smells Like Teen Spirit");
        musicList.add("NBA");
    }

    @Override
    public List<String> getSong() {
        return musicList;
    }
}
