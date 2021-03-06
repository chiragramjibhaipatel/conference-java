package com.example.conference.repository;

import com.example.conference.model.Subject;

import java.util.ArrayList;
import java.util.List;

public class HibernateSubjectRepositoryImpl implements SubjectRepository {

    @Override
    public List<Subject> findAll(){
        List<Subject> listSubject = new ArrayList<>();
        Subject subject = new Subject();
        subject.setName("Sprint Boot Introduction");
        subject.setIsTechnical(true);
        listSubject.add(subject);
        return listSubject;
    }

}
