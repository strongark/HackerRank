package com.tranmpham.hackerrank.hackerrank;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.servlet.ServletContext;

/**
 * Created by tranpham on 11/5/17.
 */
@RunWith(SpringRunner.class)
@WebMvcTest
public class AdvanceStructureControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void solvAlmostEqualTest() throws Exception{
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/advance/almostequal?input=5 2\n1 3 4 3 0\n3\n0 1\n1 3\n0 4")
                .accept(MediaType.ALL);

        MvcResult result= mockMvc.perform(requestBuilder).andReturn();
        System.out.println(result.getResponse());
        String answer= result.getResponse().getContentAsString();
        String expected="1\n3\n6\n";
        Assert.assertEquals("Result is not the same",expected,answer);

    }
}
