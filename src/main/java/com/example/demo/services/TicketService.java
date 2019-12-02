package com.example.demo.services;

import com.example.demo.models.Something;
import java.util.List;

public interface TicketService {

  Something findById(Long id);
  List<Something> findAll();
  void save (Something something);
}
