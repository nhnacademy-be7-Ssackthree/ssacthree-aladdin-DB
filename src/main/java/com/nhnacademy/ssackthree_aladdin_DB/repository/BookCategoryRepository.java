package com.nhnacademy.ssackthree_aladdin_DB.repository;

import com.nhnacademy.ssackthree_aladdin_DB.domain.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {
}