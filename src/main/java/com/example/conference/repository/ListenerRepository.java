package com.example.conference.repository;

import com.example.conference.model.Listener;

import java.util.List;

public interface ListenerRepository {
    List<Listener> findAll();
}
