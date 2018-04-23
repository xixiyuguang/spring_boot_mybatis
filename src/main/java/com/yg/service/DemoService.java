package com.yg.service;

import com.yg.bean.Demo;
import com.yg.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public List<Demo> likeName(String name){
        return demoMapper.likeName(name);
    }

    // 只有查询不需要事务
    @Transactional
    public void  save(Demo demo){
        demoMapper.save(demo);
    }


    @Transactional
    public void  save2(String  name){
        demoMapper.save2(name);
    }

}
