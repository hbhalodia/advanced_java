package com.bascis.springfundamentals.dao;

import com.bascis.springfundamentals.model.SubjectModel;
import com.bascis.springfundamentals.response.SubjectResponse;

public interface SubjectDao {

    public SubjectResponse save(SubjectModel model);

    public SubjectResponse read(Long id);
}
