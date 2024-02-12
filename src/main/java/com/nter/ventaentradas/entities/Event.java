package com.nter.ventaentradas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

@Entity
@Table(name = "tbl_event")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_event")
    private Integer idEvent;
    private String name;
    @Column(name = "init_date")
    private Date initDate;
    @Column(name = "end_date")
    private Date endDate;
    private TextArea description;
    @Column(name = "max_capacity")
    private Integer maxCapacity;
    @Column(name = "max_tickets")
    private Integer maxTickets;
}
