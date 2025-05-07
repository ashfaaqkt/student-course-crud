package com.example.studentcourse.repositories;

import com.example.studentcourse.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
