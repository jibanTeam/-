package com.example.app.module.index.server;

import com.example.app.currency.ResultData;
import com.example.app.module.index.entity.SystemTest;
import com.example.app.module.index.entity.SystemTestExample;
import com.example.app.module.index.mapper.SystemTestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class SystemTestServerImpl implements SystemTestServer{

    @Resource
    private SystemTestDao systemTestDao;

    @Override
    public ResultData<List<SystemTest>> getTask(String name) {
        SystemTestExample example =new SystemTestExample();
        SystemTestExample.Criteria criteria1 = example.createCriteria();
        if(name==null||"".equals(name))
            return new ResultData<>("任务名称不能为空");
        criteria1.andTaskNameLike("%"+name+"%");
        return new ResultData<>(systemTestDao.selectByExample(example));
    }

}
