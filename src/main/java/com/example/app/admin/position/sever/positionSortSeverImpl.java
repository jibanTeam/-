package com.example.app.admin.position.sever;

import com.example.app.admin.position.entity.PositionSort;
import com.example.app.admin.position.mapper.PositionSortMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

@Service
public class positionSortSeverImpl implements positionSortSever{

    @Resource
    private PositionSortMapper positionSortMapper;

    @Override
    public void ins() {
//        try {
//            File filename = new File("C:\\Users\\86188\\Desktop\\work.txt");
//            InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
//            BufferedReader br = new BufferedReader(reader);
//            String line = "";
//            while ((line = br.readLine()) != null) {
//                String[] list = line.split(" ");
//                String m=list[0];
//                for (String text:list) {
//                    if(m.equals(text)){
//                        continue;
//                    }
//                    PositionSort e=new PositionSort();
//                    e.setPosition(text);
//                    e.setWorkSort(m);
//                    System.out.println(e);
//                    positionSortMapper.insertSelective(e);
//                }
//
//            }
//        }catch (Exception e){
//            System.out.println("插入失败"+e.getMessage());
//        }
    }
}
