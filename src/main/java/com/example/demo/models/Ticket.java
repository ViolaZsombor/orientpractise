package com.example.demo.models;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ticket {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String reporte;
  private String manufacturer;
  private String serial_number;
  private String description;
  private Date date;

  public Ticket() {
  }

  public Ticket(String reporte, String manufacturer, String serial_number,
      String description, Date date) {
    this.reporte = reporte;
    this.manufacturer = manufacturer;
    this.serial_number = serial_number;
    this.description = description;
    this.date = date;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getReporte() {
    return reporte;
  }

  public void setReporte(String reporte) {
    this.reporte = reporte;
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


