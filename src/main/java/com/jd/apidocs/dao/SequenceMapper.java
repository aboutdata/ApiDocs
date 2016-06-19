package com.jd.apidocs.dao;

import com.jd.apidocs.domain.Sequence;

public interface SequenceMapper {

    public Sequence getSequenceByName(String name);

    public void updateSequence(Sequence sequence);
}
