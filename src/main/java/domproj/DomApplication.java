package domproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
@RequestMapping("/index")

public class DomApplication {
        @GetMapping("/greetings")
         @CrossOrigin(origins = "*")
	String[] home() {
         String []words={"Hello World!","dom"};   
		return words;
	}
        
	public static void main(String[] args) {
		SpringApplication.run(DomApplication.class, args);
	}
}
