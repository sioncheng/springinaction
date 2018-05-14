package com.springinaction.ch5.web;

import com.springinaction.ch5.business.data.DummySpitterRepository;
import com.springinaction.ch5.business.data.SpitterRepository;
import com.springinaction.ch5.business.model.Spitter;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class SpitterControllerTest {

    @Test
    public void shouldShowRegisterForm() throws Exception {
        SpitterController controller = new SpitterController(new DummySpitterRepository());
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

        mockMvc.perform(MockMvcRequestBuilders.get("/spitter/register"))
                .andExpect(MockMvcResultMatchers.view().name("registerForm"));
    }

    @Test
    public void shouldProcessRegisteration() throws Exception {

        Spitter unsavedSpitter = new Spitter("sion", "cheng", "sionsion", "123");
        Spitter savedSpitter = new Spitter(24L, "sion", "cheng", "sionsion", "123");

        SpitterRepository spitterRepository = Mockito.mock(SpitterRepository.class);
        Mockito.when(spitterRepository.save(unsavedSpitter)).thenReturn(savedSpitter);

        SpitterController controller = new SpitterController(spitterRepository);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(MockMvcRequestBuilders
                .post("/spitter/register")
                .param("firstName", unsavedSpitter.getFirstName())
                .param("lastName", unsavedSpitter.getLastName())
                .param("username", unsavedSpitter.getUsername())
                .param("password", unsavedSpitter.getPassword())
        ).andExpect(MockMvcResultMatchers.redirectedUrl("/spitter/" + unsavedSpitter.getUsername()));

    }
}
