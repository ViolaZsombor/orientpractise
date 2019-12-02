package com.example.demo.services;

import com.example.demo.models.Ticket;
import com.example.demo.repos.TicketRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

  private TicketRepo ticketRepo;

  @Autowired
  public TicketServiceImpl(TicketRepo ticketRepo) {
    this.ticketRepo = ticketRepo;
  }

  @Override
  public Ticket findById(Long id) {
    return ticketRepo.findById(id).orElse(null);
  }

  @Override
  public List<Ticket> findAll() {
    return ticketRepo.findAll();
  }

  @Override
  public void save(Ticket ticket) {
    ticketRepo.save(ticket);
  }
}
