package com.springinaction.ch5.web;

import com.springinaction.ch5.business.data.SpittleRepository;
import com.springinaction.ch5.business.model.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/spittles")
public class SpittleController {

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model) {
        List<Spittle> spittleList = this.spittleRepository.findSpittleList(Long.MAX_VALUE, 20);
        model.addAttribute("spittleList", spittleList);
        return "spittles";
    }

    private SpittleRepository spittleRepository;
}
