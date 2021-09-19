package com.bascis.springfundamentals.convertor;

import com.bascis.springfundamentals.entity.ESubject;
import com.bascis.springfundamentals.model.SubjectModel;

public class ModelEntityConvertor {

    public static ESubject convertSubjectModelToEntity(SubjectModel model){

        ESubject sub = new ESubject();

        sub.setName(model.getName());
        sub.setSubCode(model.getSubCode());

        return sub;
    }

    public static SubjectModel convertSubjectEntityToModel(ESubject entity){

        SubjectModel sub = new SubjectModel();

        sub.setId(entity.getId());
        sub.setName(entity.getName());
        sub.setSubCode(entity.getSubCode());

        return sub;
    }
}
