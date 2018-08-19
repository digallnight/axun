package com.lqp.axun.common.impl;

import com.lqp.axun.common.api.SequenceService;
import com.lqp.axun.util.seq.IdWorker;

public class SequenceServiceImpl implements SequenceService {
    @Override
    public String getSnowSequence() {
        final IdWorker idWorker = new IdWorker(1, 2);
        return String.valueOf(idWorker.nextId());
    }
}
