package ru.agentche.musicplayer;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 01.12.2022
 */
@Component
public class ClassicalMusic implements Music {
    private final List<String> musicList = new ArrayList<>();

    public ClassicalMusic() {
        musicList.add("Hungarian Rhapsody");
        musicList.add("Ave Maria");
        musicList.add("Arr. for Piano from Concerto for Strings in G Minor, RV 156");
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public List<String> getSong() {
        return musicList;
    }
}
