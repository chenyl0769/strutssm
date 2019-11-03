package com.cyl.service;

import com.cyl.entity.Coser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Coserservice {
    public List<Coser> findall();

    public Coser findone(int id);
}
