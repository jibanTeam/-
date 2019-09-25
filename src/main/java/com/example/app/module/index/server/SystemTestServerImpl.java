package com.example.app.module.index.server;

import com.example.app.module.index.entity.SystemTestExample;
import com.example.app.module.index.mapper.SystemTestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class SystemTestServerImpl implements SystemTestServer{

    @Resource
    private SystemTestDao systemTestDao;

    @Override
    public Object getTask() {
        SystemTestExample example =new SystemTestExample();
        return systemTestDao.selectByExample(example);
    }

}
