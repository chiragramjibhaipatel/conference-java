package com.example.conference.repository;

import com.example.conference.model.Listener;

import java.util.ArrayList;
import java.util.List;

public class HibernateListenerRepositoryImpl implements ListenerRepository {

    public List<Listener> findAll(){
            List<Listener> listListener = new ArrayList<>();

            Listener listener = new Listener();
            listener.setFirstName("Rakesh");
            listener.setLastName("Dobariya");

            listListener.add(listener);

            return listListener;

    }
}
