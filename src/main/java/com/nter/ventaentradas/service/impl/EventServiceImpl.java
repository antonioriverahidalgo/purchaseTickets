package com.nter.ventaentradas.service.impl;

import com.nter.ventaentradas.entities.Event;
import com.nter.ventaentradas.repository.EventRepository;
import com.nter.ventaentradas.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;
    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event getEventById(Integer idEvent) {
        // Event eventById = eventRepository.findById(idEvent).orElse(null);
        return eventRepository.findById(idEvent).orElse(null);
    }
}
