package com.example.conference.repository;

import com.example.conference.model.Ticket;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HibernateTicketRepositoryImpl implements TicketRepository {

    @Override
    public List<Ticket> findAll(){
        List<Ticket> listTicket = new ArrayList<>();
        Ticket ticket = new Ticket();
        ticket.setBuyerName("Chirag Patel");
        listTicket.add(ticket);
        return listTicket;
    }
}
