package com.bascis.springfundamentals.dao;

import com.bascis.springfundamentals.convertor.ModelEntityConvertor;
import com.bascis.springfundamentals.entity.ESubject;
import com.bascis.springfundamentals.model.SubjectModel;
import com.bascis.springfundamentals.repository.SubjectRepository;
import com.bascis.springfundamentals.response.ApiStatus;
import com.bascis.springfundamentals.response.SubjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubjectDaoImpl implements SubjectDao {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public SubjectResponse save(SubjectModel model) {

        ESubject subEntity =  ModelEntityConvertor.convertSubjectModelToEntity(model);
        ESubject savedEntity      = subjectRepository.save(subEntity);

        System.out.println("Data Saved Succesfully "+ savedEntity.getId());
        return new SubjectResponse(ApiStatus.SUCESS, HttpStatus.OK.value(), ModelEntityConvertor.convertSubjectEntityToModel(savedEntity));
    }

    @Override
    public SubjectResponse read(Long id) {
        Optional<ESubject> subEntity = subjectRepository.findById(id);
        return new SubjectResponse(ApiStatus.SUCESS, HttpStatus.OK.value(), ModelEntityConvertor.convertSubjectEntityToModel(subEntity.get()));

    }

    @Override
    public SubjectResponse update(Long id, SubjectModel model) {
        Optional<ESubject> savedEntity = subjectRepository.findById(id);

        savedEntity.get().setSubCode(model.getSubCode());
        savedEntity.get().setName(model.getName());

        return new SubjectResponse(ApiStatus.SUCESS, HttpStatus.OK.value(), ModelEntityConvertor.convertSubjectEntityToModel(savedEntity.get()));

    }

    @Override
    public SubjectResponse delete(Long id) {

        Optional<ESubject> deletedEntity = subjectRepository.findById(id);
        subjectRepository.deleteById(id);

        return new SubjectResponse(ApiStatus.SUCESS, HttpStatus.OK.value(), ModelEntityConvertor.convertSubjectEntityToModel(deletedEntity.get()));

    }
}
