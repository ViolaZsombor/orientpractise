package com.example.demo.services;

import com.example.demo.models.Ticket;
import java.util.List;

public interface TicketService {

  Ticket findById(Long id);
  List<Ticket> findAll();
  void save (Ticket ticket);
}
