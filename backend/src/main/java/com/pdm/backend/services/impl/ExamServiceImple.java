package com.pdm.backend.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pdm.backend.models.Exam;
import com.pdm.backend.repositoriess.ExamRepository;
import com.pdm.backend.services.ExamServices;

@Service
public class ExamServiceImple implements ExamServices{

    private ExamRepository examRepository;

    public ExamServiceImple(ExamRepository examRepository){
        this.examRepository = examRepository;
    }

    @Override
    public Exam saveExam(long exam_id , Exam exam ){
        exam.setExamID(exam_id);
        return examRepository.save(exam);
    }

    @Override
    public Optional<Exam> findOne(long exam_id){
        return examRepository.findById(exam_id);
    }

    @Override 
    public Boolean isExist(long exam_id){
        return examRepository.existsById(exam_id);
    }

    @Override
    public Page<Exam> findAll(Pageable pageable){
        return examRepository.findAll(pageable);
    }
    
    

    @Override
    public  void delete(long exam_id){
                examRepository.deleteById(exam_id);
    }


}
