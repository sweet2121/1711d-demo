package com.wrd.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/upload")
@CrossOrigin
public class UploadController {

    @Value("${file.path}")
    private  String filePath;

    @Value("${file.domain}")
    private  String fileDomain;

    @PostMapping("uploadPic")
    public Map<String, Object> uploadPic(@RequestParam("file") MultipartFile file) {
        Map<String,Object> map = new HashMap<>();
        map.put("sucess","上传失败");

        if(file!=null &&!file.isEmpty()){
            String oldFileName = file.getOriginalFilename();
            String fileName =  UUID.randomUUID()+oldFileName.substring(oldFileName.lastIndexOf("."));
            try {
                file.transferTo(new File(filePath,fileName));
                map.put("sucess","上传成功");
                map.put("imgUrl",fileDomain+fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return map;
    }
}
