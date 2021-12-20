package com.example.exam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ExamControllerTest {
    @InjectMocks
    ExamController mainController;

    @Mock
    ExamService mainService;

    private MockMvc mockMvc;

    private static final String OWN_PATH = "/";
    private static final String DO_METHOD = "/1";


    @BeforeEach
    void setAll() {
        mockMvc = MockMvcBuilders.standaloneSetup(mainController).build();
    }

    @Test
    void whenTrueSuccess() throws Exception {
        mockMvc.perform(get(OWN_PATH))
                .andExpect(status().isOk());
    }

    @Test
    void whenResultSuccess() throws Exception {
        when(mainService.goFunc(any())).thenReturn("results");
        mockMvc.perform(get(DO_METHOD))
                .andExpect(status().isOk());
    }
}
