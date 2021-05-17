package com.fujitsu.resource;

import com.fujitsu.repository.FilterRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


@WebMvcTest(controllers = FilterRepository.class)
public class FilterResourceTest {

    @Test
    @DisplayName("Test name")
    void testName (){

    Assertions.fail("Not implemented");
    }
}
