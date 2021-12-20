package com.example.exam;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@AutoConfigureMockMvc
class ExamServiceTest {

    ExamService examService = new ExamService();

    @Test
    void FirstFunc() {
        int PARAM_1 = 1;

        String actualResult = examService.goFunc(PARAM_1);
        System.out.println(actualResult);
    }

    @Test
    void SecondFunc() {
        int PARAM_1 = 4;

        String actualResult = examService.goFunc(PARAM_1);
        System.out.println(actualResult);
    }

    @Test
    void ThirdFunc() {
        int PARAM_1 = -1;

        String actualResult = examService.goFunc(PARAM_1);
        System.out.println(actualResult);
    }
}
