package com.example.conference.service;

import com.example.conference.model.Ticket;
import com.example.conference.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl {

    TicketRepository ticketRepository;

    public List<Ticket> findAll(){
        return ticketRepository.findAll();
    }

    public TicketServiceImpl() {
    }

    public TicketServiceImpl(TicketRepository ticketRepository) {
        System.out.println("TicketServiceImpl constructor injection");
        this.ticketRepository = ticketRepository;
    }

    @Autowired
    public void setTicketRepository(TicketRepository ticketRepository) {
        System.out.println("TicketServiceImpl setter injection");
        this.ticketRepository = ticketRepository;
    }
}
