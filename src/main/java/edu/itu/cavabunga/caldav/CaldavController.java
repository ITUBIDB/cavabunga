package edu.itu.cavabunga.caldav;

import edu.itu.cavabunga.core.entity.Component;
import edu.itu.cavabunga.core.CalendarService;
import edu.itu.cavabunga.core.entity.Participant;
import edu.itu.cavabunga.core.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/calendar")
public class CaldavController {
    @Autowired
    private CalendarService calendarService;

    @Autowired
    private ParticipantService participantService;

    @GetMapping(path="/add")
    public @ResponseBody String test(){
        Participant participant = participantService.createParticipant("ali veli");
        calendarService.createCalendar();
        return "tamam";
    }

    @GetMapping(path = "/")
    public @ResponseBody Iterable<Component> createNewUser(){
        return calendarService.getAllCalendars();
    }
    /*
    public @ResponseBody String addNewCalendar(){
        componentFactory.createComponent(ComponentType.CALENDAR);
        return "kayit tamamlandi";
    }




    @GetMapping(path="/showcalendars")
    public @ResponseBody Iterable<Component> getAllComponents(){
        return componentRepository.findAll();
    } */

}