package com.example.exam;

import org.springframework.stereotype.Service;

@Service
public class ExamService {
    public String goFunc(int a) {
            int result;

            if (a > 1 && (((a - 1) % 3) == 0)) {
                result = (a - 1)/3;
                result = result + 1;
            } else if ( a == 1) {
                result = 1;
            } else {
                result = 0;
            }

            return "Result: " + result;

    }
}
