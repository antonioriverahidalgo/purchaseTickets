package com.nter.ventaentradas.controller;

import com.nter.ventaentradas.entities.Event;
import com.nter.ventaentradas.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping
    public ResponseEntity<List<Event>> listEvents (Model model){
        List<Event> events = eventService.getAllEvents();
        return ResponseEntity.ok(events);
    }

    @GetMapping("/{idEvent}")
    public ResponseEntity<Event> eventById(@PathVariable Integer idEvent){
        Event eventFound = eventService.getEventById(idEvent);
        return ResponseEntity.ok(eventFound);
    }
}
