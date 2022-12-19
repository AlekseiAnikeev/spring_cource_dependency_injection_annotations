package ru.agentche.musicplayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static ru.agentche.musicplayer.GenreOfMusic.CLASSICAL_MUSIC;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 17.12.2022
 */
@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer " + id + " Playing: " + musicPlayer.playMusic(CLASSICAL_MUSIC);
    }
}
