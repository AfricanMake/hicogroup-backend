package com.hicogroup.restfulwebservices;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
@WebAppConfiguration

@Component
public class AddNameTest {

    @InjectMocks
    HelloWorldController helloWorldController = new HelloWorldController();

    MockMvc mockMvc;

    @Before
    public void setup(){

        mockMvc = MockMvcBuilders.standaloneSetup(helloWorldController).build();
        String login = "{\"message\": \"mali\"}";
    }

    @Test
    public void testName() throws Exception{

        HelloWorldController login = new HelloWorldController();

        RequestBuilder requestBuilder = MockMvcRequestBuilders

                .get("/hello-world/mali")
                .accept(MediaType.APPLICATION_JSON).content(String.valueOf(login))
                .contentType(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        MockHttpServletResponse response = result.getResponse();

        assertEquals(HttpStatus.OK.value(), response.getStatus());


    }
}
