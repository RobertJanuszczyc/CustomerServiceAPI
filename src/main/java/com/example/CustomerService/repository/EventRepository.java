package com.example.CustomerService.repository;

import com.example.CustomerService.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
