package tk.codehawks.gsspringboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author jc
 *
 */
@RestController
public class HelloController {
	/** 
	 @RestController combines @Controller and @ResponseBody, two annotations that results in web requests returning data rather than a view 
	 **/
	@RequestMapping("/")
	public String index(){
		return "Greetings from Spring Boot!";
	}
}
