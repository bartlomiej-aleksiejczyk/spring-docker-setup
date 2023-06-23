package com.example.springintroductoryproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class HelloControllerTests {
    @Test
    void onePlusOneShouldGiveTwo() {
        var calculation = new HelloController();
        assertEquals(2,calculation.add(1,1));

    }
}
