package com.example.app.module.text.server;

import com.example.app.module.text.entity.TextVo;
import com.example.app.module.text.mapper.TextBiaoMapper;
import com.example.app.module.text.mapper.TextMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TextServerImpl implements TextServer {
    @Resource
    private TextMapper textMapper;

    @Resource
    private TextBiaoMapper textBiaoMapper;


    @Override
    public List<TextVo> test() {
        return textMapper.getList();
    }
}
