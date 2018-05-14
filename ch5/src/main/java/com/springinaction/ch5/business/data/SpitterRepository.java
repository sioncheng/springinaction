package com.springinaction.ch5.business.data;

import com.springinaction.ch5.business.model.Spitter;

public interface SpitterRepository {
    Spitter save(Spitter spitter);
}
