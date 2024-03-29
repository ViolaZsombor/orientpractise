package com.example.demo.controllers;

import com.example.demo.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TicketController {

private TicketService ticketService;

@Autowired
  public TicketController(TicketService ticketService) {
    this.ticketService = ticketService;
  }

  @GetMapping (value = "/")
  public String renderMain() {
  return "index";
  }

  @GetMapping (value = "/list")
  public String renderTicketList(Model model) {
  model.addAttribute("tickets" , ticketService.findAll());
  return "ticketlist";

  }
}


