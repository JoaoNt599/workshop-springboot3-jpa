package com.praticando.pratica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praticando.pratica.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
