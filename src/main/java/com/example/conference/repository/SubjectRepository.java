package com.example.conference.repository;

import com.example.conference.model.Subject;

import java.util.List;

public interface SubjectRepository {
    List<Subject> findAll();
}
