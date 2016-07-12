package com.jdz.apidocs.dao;

import com.jdz.apidocs.domain.Sequence;

public interface SequenceMapper {

    public Sequence getSequenceByName(String name);

    public void updateSequence(Sequence sequence);
}
