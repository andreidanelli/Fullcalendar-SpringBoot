package br.com.fullcalendar.fullcalendar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fullcalendar.fullcalendar.DTO.EventDTO;
import br.com.fullcalendar.fullcalendar.model.Event;
import br.com.fullcalendar.fullcalendar.repository.EventRepostiory;

@Service
public class EventService {
    
    @Autowired
    private EventRepostiory eventRepostiory;


    public List<EventDTO> listAllEvents() {
        List<Event> list = eventRepostiory.findAll();

        List<EventDTO> eventsDTO = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            EventDTO eventDTO = new EventDTO();

           eventDTO.setId(list.get(i).getId());
           eventDTO.setTitle(list.get(i).getTitle());
           eventDTO.setStart(list.get(i).getDatini().toString());
           eventDTO.setEnd(list.get(i).getDatfim().toString());
           eventsDTO.add(eventDTO);
        }

        return eventsDTO;
    }

}
