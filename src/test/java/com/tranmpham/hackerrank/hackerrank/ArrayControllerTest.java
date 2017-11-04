package com.tranmpham.hackerrank.hackerrank;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * Created by tranpham on 11/4/17.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(value = ArrayController.class,secure = false)
public class ArrayControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void solveArrayManipulation() throws Exception{
        RequestBuilder requestBuilder= MockMvcRequestBuilders
                .get("/array/manipulation?input=5 3\n1 2 100\n2 5 100\n 3 4 100")
                .accept(MediaType.ALL);
        MvcResult result= mockMvc.perform(requestBuilder).andReturn();
        System.out.println(result.getResponse());
        String expected="Solve!";
        Assert.assertEquals("Result is not the same"
                            ,expected
                            ,result.getResponse().getContentAsString());
    }
}
