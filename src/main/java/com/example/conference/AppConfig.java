package com.example.conference;

import com.example.conference.repository.*;
import com.example.conference.service.*;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.beans.BeanDescriptor;

@Configuration
@ComponentScan({"com.example"})
public class AppConfig {

    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService(){
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
        speakerService.setSpeakerRepository(getSpeakerRepository());
        return speakerService;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }

    @Bean(name = "listenerService")
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public ListenerService getListenerService(){
        var listenerService = new ListenerServiceImpl(getListenerRepository());
        return listenerService;
    }

    @Bean(name = "listenerRepository")
    public ListenerRepository getListenerRepository(){
        return new HibernateListenerRepositoryImpl();
    }

    @Bean(name = "subjectService")
    public SubjectService getSubjectService(){
        SubjectServiceImpl subjectService = new SubjectServiceImpl();
        return subjectService;
    }

    @Bean(name = "subjectRepository")
    public SubjectRepository getSubjectRepository(){
        return new HibernateSubjectRepositoryImpl();
    }

}
