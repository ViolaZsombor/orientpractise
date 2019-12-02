package com.example.demo.controllers;

import com.example.demo.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

  private TicketService ticketService;

  @Autowired
  public ApiController(TicketService ticketService) {
    this.ticketService = ticketService;
  }
}
