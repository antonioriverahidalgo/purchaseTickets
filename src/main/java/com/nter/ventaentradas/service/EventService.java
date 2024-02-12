package com.nter.ventaentradas.service;

import com.nter.ventaentradas.entities.Event;

import java.util.List;

public interface EventService {

    List<Event> getAllEvents();

    Event getEventById(Integer idEvent);
}
