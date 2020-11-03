package com.cos.lectureex.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

// test에서 쓸 repository 이다
@Repository
@Profile("test")
public class TestBookRepository implements BookRepository2 {

}
