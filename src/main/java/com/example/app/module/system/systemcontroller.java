package com.example.app.module.system;


import com.example.app.admin.position.entity.PositionSort;
import com.example.app.admin.position.entity.PositionSortExample;
import com.example.app.admin.position.mapper.PositionSortMapper;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/public")
public class systemcontroller {

    //    @Resource
//    private sendEmailServer mailService;
//
//    @Resource
//    private TemplateEngine templateEngine; ModelMap map
    @Resource
    private PositionSortMapper PositionMapper;

    @RequestMapping("/homePage")
    public String sample() {

        return "landing";

    }

    @RequestMapping("/login")
    public String login() {

        return "login";

    }

    @RequestMapping("/recruit")
    public String  recruit(Model model) {
        List<PositionSort> listWork= PositionMapper.selectGroup();
        Map map=new HashMap();
        for(PositionSort x:listWork){
            PositionSortExample example=new PositionSortExample();
            PositionSortExample.Criteria criteria = example.createCriteria();
            criteria.andWorkSortEqualTo(x.getWorkSort());
            List<PositionSort> list= PositionMapper.selectByExample(example);

            map.put(x.getWorkSort(),list);
        }
        Map mapMoney=new HashMap();
        ArrayList<String> monList=new ArrayList<String>();
        for (int i=0;i<10;i++){
            monList.add(i*2000+"~"+(i+1)*2000+"元");
        }
        mapMoney.put("酬劳",monList);
        ArrayList<String> yearList=new ArrayList<String>();
        for (int i=0;i<8;i++){
            yearList.add(i +"~"+ (i + 2)+"年");
        }
        ArrayList<String> timeList=new ArrayList<String>();
        timeList.add("1天以内");
        timeList.add("3天以内");
        timeList.add("5天以内");
        timeList.add("7天以内");
        timeList.add("15天以内");
        timeList.add("30天以内");
        ArrayList<String> Academic=new ArrayList<String>();
        Academic.add("不限学历");
        Academic.add("高中");
        Academic.add("技校");
        Academic.add("中专");
        Academic.add("大专");
        Academic.add("本科");
        Academic.add("硕士");
        Academic.add("博士");
        ArrayList<String> company=new ArrayList<String>();
        company.add("个人企业");
        company.add("政府机关");
        company.add("上市公司");
        company.add("中外合资");
        company.add("事业单位");
        company.add("知名企业");
        company.add("创业公司");
        ArrayList<String>  welfare=new ArrayList<String>();
        welfare.add("五险一金");
        welfare.add("包吃");
        welfare.add("包住");
        welfare.add("周末双休");
        welfare.add("房补");
        welfare.add("饭补");
        welfare.add("加班补助");
        welfare.add("饭补");

        mapMoney.put("工作年限",yearList);
        mapMoney.put("发布时间",timeList);
        mapMoney.put("学历要求",Academic);
        mapMoney.put("公司性质",company);
        mapMoney.put("福利",welfare);
        model.addAttribute("result", map);
        model.addAttribute("treatment", mapMoney);
        return "landRecruit";

    }

    @RequestMapping("/register")
    public String register(HttpSession session) {

        //进此页面时,清除session
        session.invalidate();
        return "register";

    }


    public static void main(String[] args) throws Exception{
        //C:\Users\86188\Desktop
        File filename = new File("C:\\Users\\86188\\Desktop\\work.txt");
        InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
        BufferedReader br = new BufferedReader(reader);
        String line = "";
        while((line=br.readLine()) != null) {
            System.out.println(line);
        }

    }

}
