package com.example.conference;

import com.example.conference.model.Listener;
import com.example.conference.model.Speaker;
import com.example.conference.service.ListenerService;
import com.example.conference.service.SpeakerService;
import com.example.conference.service.SpeakerServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class ConferenceApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        var speakerService = applicationContext.getBean("speakerService", SpeakerService.class);
        var speakerService2 = applicationContext.getBean("speakerService", SpeakerService.class);
        var listenerService = applicationContext.getBean("listenerService", ListenerService.class);
        var listenerService2 = applicationContext.getBean("listenerService", ListenerService.class);

        List<Speaker> listSpeakers = speakerService.findAll();
        System.out.println("from setter injection: " + listSpeakers.get(0).getFirstName());

        List<Listener> listListener = listenerService.findAll();
        System.out.println("from construction injection: " + listListener.get(0).getFirstName() );

        System.out.println("Two instance of SpeakerService with Scope = singleton.");
        System.out.println(speakerService);
        System.out.println(speakerService2);

        System.out.println("Two instance of ListenerService with Scope = ptototype");
        System.out.println(listenerService);
        System.out.println(listenerService2);
    }

}
