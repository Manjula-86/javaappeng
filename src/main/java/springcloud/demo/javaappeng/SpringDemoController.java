package springcloud.demo.javaappeng;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDemoController {

	 @GetMapping("/hello")
	  public String hello() {
		 //http://localhost:8080/hello
	    return "Hello world - springboot-appengine-Flexable Geetha!";
	  }
}
