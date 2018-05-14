package com.springinaction.ch5.web;

import com.springinaction.ch5.business.data.SpittleRepository;
import com.springinaction.ch5.business.model.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Method;
import java.util.List;

@Controller
@RequestMapping("/spittles")
public class SpittleController {

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String spittles(@RequestParam(value = "max", defaultValue = "0") long max
            ,@RequestParam(value = "count", defaultValue = "20") int count
            ,Model model) {
        if (max == 0) {
            max = Long.MAX_VALUE;
        }

        List<Spittle> spittleList = this.spittleRepository.findSpittleList(max, count);
        model.addAttribute("spittleList", spittleList);
        return "spittles";
    }

    @RequestMapping(value = "/{spittleId}", method=RequestMethod.GET)
    public String spittle(@PathVariable long spittleId, Model model) {
        model.addAttribute("spittle", spittleRepository.findOne(spittleId));
        return "spittle";
    }

    private SpittleRepository spittleRepository;
}
