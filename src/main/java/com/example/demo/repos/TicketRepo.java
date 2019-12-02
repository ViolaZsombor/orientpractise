package com.example.demo.repos;

import com.example.demo.models.Something;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo extends CrudRepository<Something, Long> {

  Optional<Something> findById(Long id);
  List<Something> findAll();
}
