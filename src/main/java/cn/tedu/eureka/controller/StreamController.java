package cn.tedu.eureka.controller;

import javax.annotation.Resource;

import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.eureka.stream.StreamClient;

@RestController
public class StreamController {
	
	@Resource
	private StreamClient streamClient;
	
	@GetMapping("/message/send")
	public String send() {
		streamClient.outPut().send(MessageBuilder.withPayload("发送了一条消息").build());
		return "发送成功";
		
	}
}
