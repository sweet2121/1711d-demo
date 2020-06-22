package com.wrd.entity;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public enum WebLockEnum {

    精装修(1,"精装修"),普通装修(2,"普通装修"),毛坯(3,"毛坯");
    private Integer id;
    private  String name;

    WebLockEnum(Integer id,String name){
        this.id=id;
        this.name=name;
    }

     public  static List<Map<String,Object>> getWebLockList(){
        List<Map<String,Object>> list = new ArrayList<>();

         WebLockEnum[] values = WebLockEnum.values();
         for(WebLockEnum value:values){
             Map<String,Object> locakMap = new HashMap<>();
             locakMap.put("id",value.getId());
             locakMap.put("name",value.getName());
             locakMap.put("ordinal",value.ordinal());
             list.add(locakMap);
         }
         return  list;
     }
}
