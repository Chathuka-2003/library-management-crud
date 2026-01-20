package org.example.repository;

import org.example.model.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface BookRepository extends JpaRepository<BookEntity,Long> {
}
