package trainingSB.trainingSB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@GetMapping("/test/{name}")
	public String get(@PathVariable("name") String name) {
		return "welcome "+name;
	}
	
}
