package com.wrd.controller;

import com.wrd.entity.WebLockEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/weblock")
public class WeblockController {

    @GetMapping("enumAll")
    public Object enumAll(){
        List<Map<String, Object>> webLockList = WebLockEnum.getWebLockList();
        return  webLockList;
    }
}
