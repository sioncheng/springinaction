package com.springinaction.ch5.business.data;

import com.springinaction.ch5.business.model.Spittle;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class DummySpittleRepository implements SpittleRepository {

    public List<Spittle> findSpittleList(long max, int count) {
        List<Spittle> spittles = new ArrayList<Spittle>(count);
        for (int i = 0 ; i < count; i++) {
            spittles.add(new Spittle("spittle " + i, new Date()));
        }

        return spittles;
    }
}
