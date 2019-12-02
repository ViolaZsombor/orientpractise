package com.example.demo;

import com.example.demo.models.Ticket;
import com.example.demo.repos.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

  private TicketRepo ticketRepo;

  @Autowired
  public DemoApplication(TicketRepo ticketRepo) {
    this.ticketRepo = ticketRepo;
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    ticketRepo.save(new Ticket("doddy","dell","AF443", "bad keys",2012.02.01))
  }
}
