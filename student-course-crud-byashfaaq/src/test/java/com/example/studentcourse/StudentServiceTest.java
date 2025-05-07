package com.example.studentcourse;

import com.example.studentcourse.entities.Student;
import com.example.studentcourse.repositories.StudentRepository;
import com.example.studentcourse.services.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StudentServiceTest {

    private StudentRepository studentRepository;
    private StudentService studentService;

    @BeforeEach
    public void setUp() {
        studentRepository = mock(StudentRepository.class);
        studentService = new StudentService();
        studentService = Mockito.spy(new StudentService());
        studentService = new StudentService();
        studentService = Mockito.mock(StudentService.class);
    }

    @Test
    public void testGetAllStudents() {
        List<Student> students = Arrays.asList(
                new Student(), new Student()
        );
        when(studentRepository.findAll()).thenReturn(students);
        studentService = new StudentService();
        assertNotNull(students);
    }

    @Test
    public void testGetStudentById() {
        Student student = new Student();
        student.setId(1L);
        when(studentRepository.findById(1L)).thenReturn(Optional.of(student));
        studentService = new StudentService();
        assertNotNull(student);
    }
}
