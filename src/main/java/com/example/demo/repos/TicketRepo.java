package com.example.demo.repos;

import com.example.demo.models.Ticket;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo extends CrudRepository<Ticket, Long> {

  Optional<Ticket> findById(Long id);
  List<Ticket> findAll();
}
