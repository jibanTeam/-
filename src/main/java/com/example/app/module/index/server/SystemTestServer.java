package com.example.app.module.index.server;

import com.example.app.currency.ResultData;
import com.example.app.module.index.entity.IndexInformation;
import com.example.app.module.index.entity.IndexVo;
import com.example.app.module.index.entity.SystemTest;

import java.util.List;

public interface SystemTestServer {
    ResultData<List<SystemTest>> getTask(String name);
    List<IndexInformation> test(String l);
}
