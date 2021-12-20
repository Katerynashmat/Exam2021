package com.example.exam;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ExamController {
    private final ExamService examService;

    @GetMapping("/")
    public ResponseEntity<?> functin() {
        return ResponseEntity.ok("Kate project");
    }

    @GetMapping("/{param1}")
    public ResponseEntity<?> anyResults(@PathVariable int param1) {
        return ResponseEntity.ok(examService.goFunc(param1));
    }
}
