package com.example.conference.repository;

import com.example.conference.model.Speaker;
import com.example.conference.repository.SpeakerRepository;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> listSpeakers = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Chirag");
        speaker.setLastName("Patel");
        listSpeakers.add(speaker);
        return listSpeakers;
    }
}
