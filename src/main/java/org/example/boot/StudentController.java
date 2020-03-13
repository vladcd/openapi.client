package org.example.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.example.client.rest.api.StudentApiClient;
import org.example.client.rest.model.StudentDTO;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentApiClient studentApiClient;

    @GetMapping
    public ResponseEntity<List<StudentDTO>> getStudents() {
        return studentApiClient.getStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> getStudent(@PathVariable("id") Integer id) {
        return studentApiClient.getStudent(id);
    }

}
