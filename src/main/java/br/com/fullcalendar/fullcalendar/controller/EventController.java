package br.com.fullcalendar.fullcalendar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fullcalendar.fullcalendar.DTO.EventDTO;
import br.com.fullcalendar.fullcalendar.service.EventService;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value = "/api/events", produces = "application/json")
public class EventController {
    
    @Autowired
    EventService eventService;

    @GetMapping
    public List<EventDTO> listAllEvents() {
        return eventService.listAllEvents();
    }

}
