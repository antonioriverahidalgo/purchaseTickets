package com.nter.ventaentradas.repository;

import com.nter.ventaentradas.entities.PurchasePersonTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchasePersonRepository extends JpaRepository<PurchasePersonTicket,Integer> {
}
