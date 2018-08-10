package com.springinaction.ch5.business.data;

import com.springinaction.ch5.business.model.Spittle;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
@Repository
public class DummySpittleRepository implements SpittleRepository {

    public List<Spittle> findSpittleList(long max, int count) {
        List<Spittle> spittles = new ArrayList<Spittle>(count);
        for (int i = 0 ; i < count; i++) {
            spittles.add(new Spittle("spittle " + i, new Date()));
        }

        return spittles;
    }

    public Spittle findOne(long spittleId) {
        return null;
    }
}
