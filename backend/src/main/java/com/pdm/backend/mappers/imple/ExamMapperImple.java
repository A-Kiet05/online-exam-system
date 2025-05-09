package com.pdm.backend.mappers.imple;

import org.hibernate.annotations.Comment;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.pdm.backend.mappers.Mapper;
import com.pdm.backend.models.Exam;
import com.pdm.backend.models.dto.ExamDto;
import com.pdm.backend.repositoriess.ExamRepository;

@Component
public class ExamMapperImple implements Mapper<Exam , ExamDto>{
   private ModelMapper modelMapper;

   @Override 
   public Exam mapfrom(ExamDto examDto){
     return modelMapper.map(examDto, Exam.class);
   }

   @Override
   public ExamDto mapto(Exam exam){
     return modelMapper.map(exam, ExamDto.class);
   }
}
    

