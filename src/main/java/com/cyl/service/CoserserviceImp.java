package com.cyl.service;

import com.cyl.dao.CoserDao;
import com.cyl.entity.Coser;
import org.springframework.stereotype.Service;

import java.util.List;

public class CoserserviceImp implements Coserservice {

    public CoserDao getCoserDao() {
        return coserDao;
    }

    public void setCoserDao(CoserDao coserDao) {
        this.coserDao = coserDao;
    }

    private CoserDao coserDao;
    @Override
    public List<Coser> findall() {
        return coserDao.findall();
    }

    @Override
    public Coser findone(int id) {
        return coserDao.findbyid(id);
    }
}
