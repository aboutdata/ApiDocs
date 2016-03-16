package com.jingji.apidocs.dao;

import com.jingji.apidocs.domain.Sequence;

public interface SequenceMapper {

    public Sequence getSequenceByName(String name);

    public void updateSequence(Sequence sequence);
}
