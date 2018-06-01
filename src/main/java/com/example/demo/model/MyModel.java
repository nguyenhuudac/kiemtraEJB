package com.example.demo.model;

import com.example.demo.entity.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MyModel extends PagingAndSortingRepository<Student, Integer> {
//    Page<Monan> findByStatusIsNot(int status, Pageable pageable);
}
