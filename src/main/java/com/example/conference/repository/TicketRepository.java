package com.example.conference.repository;

import com.example.conference.model.Ticket;

import java.util.List;

public interface TicketRepository {
    List<Ticket> findAll();
}
