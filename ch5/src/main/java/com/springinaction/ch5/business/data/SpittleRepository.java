package com.springinaction.ch5.business.data;

import com.springinaction.ch5.business.model.Spittle;

import java.util.List;

public interface SpittleRepository {

    List<Spittle> findSpittleList(long max, int count);

    Spittle findOne(long spittleId);
}
