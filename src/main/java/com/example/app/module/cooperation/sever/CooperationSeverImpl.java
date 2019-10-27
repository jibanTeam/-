package com.example.app.module.cooperation.sever;

import com.example.app.currency.ResultData;
import com.example.app.module.cooperation.entity.CooperationEntity;
import com.example.app.module.cooperation.mapper.CooperationMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class CooperationSeverImpl implements CooperationSever{

    @Resource
    private CooperationMapper cooperationMapper;
    @Override
    public ResultData index(CooperationEntity e) {
        try {
            e.setCreatTime(new Date());
            cooperationMapper.index(e);
        }catch (Exception eMs){
            System.out.println(eMs.getMessage());
            return  new ResultData("提交失败", "false");

        }
        return  new ResultData("提交成功", "true");
    }

}
