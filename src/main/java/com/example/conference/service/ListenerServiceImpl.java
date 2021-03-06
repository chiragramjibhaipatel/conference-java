package com.example.conference.service;

import com.example.conference.model.Listener;
import com.example.conference.repository.ListenerRepository;

import java.util.List;

public class ListenerServiceImpl implements ListenerService {

    ListenerRepository listenerRepository;

    public ListenerServiceImpl(ListenerRepository listenerRepository) {
        this.listenerRepository = listenerRepository;
    }

    @Override
    public List<Listener> findAll(){
        return listenerRepository.findAll();
    }
}
