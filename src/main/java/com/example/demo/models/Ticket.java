package com.example.demo.models;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.annotation.CreatedDate;

@Entity
public class Ticket {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String reporter;
  private String manufacturer;
  private String serial_number;
  private String description;
  @CreatedDate
  private Date date = new Date ();

  public Ticket() {
  }

  public Ticket(String reporter, String manufacturer, String serial_number,
      String description) {
    this.reporter = reporter;
    this.manufacturer = manufacturer;
    this.serial_number = serial_number;
    this.description = description;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getReporter() {
    return reporter;
  }

  public void setReporter(String reporter) {
    this.reporter = reporter;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getSerial_number() {
    return serial_number;
  }

  public void setSerial_number(String serial_number) {
    this.serial_number = serial_number;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}


