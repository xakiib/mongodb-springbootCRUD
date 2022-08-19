package com.bezkoder.spring.data.mongodb.repository;

import com.bezkoder.spring.data.mongodb.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo  extends MongoRepository<Book, Integer> {
}
