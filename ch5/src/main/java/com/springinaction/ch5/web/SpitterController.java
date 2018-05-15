package com.springinaction.ch5.web;

import com.springinaction.ch5.business.data.SpitterRepository;
import com.springinaction.ch5.business.model.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;

import javax.servlet.http.Part;

@Controller
@RequestMapping("/spitter")
public class SpitterController {

    @Autowired
    public SpitterController(SpitterRepository repository) {
        this.spitterRepository = repository;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegisterForm() {
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistration(@RequestPart("profilePicture") Part profilePictrue
            , Spitter spitter){
        this.spitterRepository.save(spitter);
        return "redirect:/spitter/" + spitter.getUsername();
    }

    @ExceptionHandler(Exception.class)
    public String processProfileException() {
        return "error/error";
    }

    private SpitterRepository spitterRepository;
}
