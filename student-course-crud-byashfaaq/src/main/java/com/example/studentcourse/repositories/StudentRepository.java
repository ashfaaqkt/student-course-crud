package com.example.studentcourse.repositories;

import com.example.studentcourse.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("SELECT s FROM Student s INNER JOIN s.course c WHERE c.title = :title")
    List<Student> findByCourseTitle(@Param("title") String title);
}
