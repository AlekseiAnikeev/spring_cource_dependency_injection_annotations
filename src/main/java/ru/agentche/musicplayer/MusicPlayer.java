package ru.agentche.musicplayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 01.12.2022
 */
@Component
@Scope("prototype")
public class MusicPlayer {
    private final Music classicalMusic;
    private final Music rockMusic;
    private final Music rapMusic;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
                       @Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("rapMusic") Music rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
    }

    public String playMusic(GenreOfMusic genreOfMusic) {
        Random randomTrack = new Random();
        switch (genreOfMusic) {
            case CLASSICAL_MUSIC:
                return classicalMusic.getSong().get(randomTrack.nextInt(3));
            case ROCK_MUSIC:
                return rockMusic.getSong().get(randomTrack.nextInt(3));
            default:
                return rapMusic.getSong().get(randomTrack.nextInt(3));
        }
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
