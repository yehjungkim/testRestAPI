package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import vo.RestVo;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@RequestMapping("/")
	public String hello() {
		
		return "hello";
	}
	
	@GetMapping("/test")
	public ResponseEntity<RestVo> restTest() {
		RestTemplate rt = new RestTemplate();
		
		String base = "http://api.odcloud.kr/api";
		String path = "/3084536/v1/uddi:75e22d59-7036-4b9b-844f-8014635d3384";
		String decodeKey = "?serviceKey=c8FNtKVvzHDxyV1ZHHTtrWnPHnMvmY413zYxxjRk3F/E3vfy2Cay0Rq65JIdO8KLdcoCHFFACPRRT5qYQ4b1CA==";

		String url = base + path + decodeKey;
		
		RestTemplate rest = new RestTemplate();
		
		RestVo vovo = rest.getForObject(url, RestVo.class);
		
		RestVo vo = rt.getForObject(url, RestVo.class);
		
		
		return new ResponseEntity<>(vovo,HttpStatus.ACCEPTED);
	}

}
