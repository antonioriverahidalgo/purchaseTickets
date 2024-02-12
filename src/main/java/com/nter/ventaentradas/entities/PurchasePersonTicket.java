package com.nter.ventaentradas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "tbl_purchase_person_ticket")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchasePersonTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_purchase")
    private Integer idPurchase;
    @Column(name = "purchase_date")
    private Date purchaseDate;
    @Column(name = "total_price")
    private double totalPrice;


    @ManyToOne
    @JoinColumn(name = "FK_person", nullable = false)
    private Person person;

    @OneToOne
    @JoinColumn(name = "FK_ticket", nullable = false)
    private Ticket ticket;


}
