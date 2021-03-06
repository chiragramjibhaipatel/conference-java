package com.example.conference.service;

import com.example.conference.model.Subject;
import com.example.conference.repository.HibernateSubjectRepositoryImpl;
import com.example.conference.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SubjectServiceImpl implements SubjectService {


    SubjectRepository subjectRepository;

    public SubjectServiceImpl() {
        System.out.println("Inside SubjectServiceImpl No Args Constructor");
    }

    @Override
    public List<Subject> findAll(){
        return subjectRepository.findAll();
    }

    @Autowired
    public void setSubjectRepository(SubjectRepository subjectRepository) {
        System.out.println("Inside setSubjectRepository");
        this.subjectRepository = subjectRepository;
    }

}
