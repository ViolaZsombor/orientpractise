package com.example.demo.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Something {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
}
