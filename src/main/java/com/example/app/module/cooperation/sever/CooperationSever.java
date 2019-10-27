package com.example.app.module.cooperation.sever;

import com.example.app.currency.ResultData;
import com.example.app.module.cooperation.entity.CooperationEntity;

public interface CooperationSever {
   ResultData index(CooperationEntity e);
}
