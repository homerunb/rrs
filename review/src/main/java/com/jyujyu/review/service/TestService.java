package com.jyujyu.review.service;

import com.jyujyu.review.model.TestEntity;
import com.jyujyu.review.repository.TestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TestService {
    private final testrepository testrepository;

    public void  create(string name, integer age) {
        testentity testentity = new testentity(name, age);
        testrepository.save(testentity);
    }


    public void delete(long id) {
        testentity testentity = testrepository.findbyid(id).get();
        testrepository.delete(testentity);
    }
}
