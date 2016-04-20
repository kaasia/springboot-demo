package com.kfly.web;

import com.kfly.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Kfly on 2016/4/20.
 */
@Controller
public class SampleController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/")
    @ResponseBody
    @Transactional(readOnly=true)
    public String helloWorld(){
        return this.cityService.getCity("Bath","UK").getMap();
    }
}
