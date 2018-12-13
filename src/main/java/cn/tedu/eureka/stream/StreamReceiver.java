package cn.tedu.eureka.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@EnableBinding(StreamClient.class)
@Component
public class StreamReceiver {
	
	@StreamListener(value="output")
	public void process(String message) {
		System.err.println(message.toString());
	}
}
