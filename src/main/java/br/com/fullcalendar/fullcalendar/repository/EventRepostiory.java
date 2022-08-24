package br.com.fullcalendar.fullcalendar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fullcalendar.fullcalendar.model.Event;

public interface EventRepostiory extends JpaRepository<Event, Integer>{
    
}
