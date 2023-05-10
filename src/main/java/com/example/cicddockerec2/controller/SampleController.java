package com.example.cicddockerec2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @RequestMapping("/")
    public String index(){
        return "docker기반 ec2서버에 cicd 적용 예제 프로젝트 입니다. 배포 왜이리안돼..";
    }
}
