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
	node home() {
         task zakltask =new task("zaklady");
        task murtask =new task("oporny mur");
        task stenytask =new task("stavba steny");
        node zaklad=new node(zakltask);
        node mur=new node(murtask,zaklad);
        node steny=new node(stenytask,mur);
         task oknatask =new task("okna");
        node okna=new node(oknatask,steny);
        mur.addchild(steny);
        steny.addchild(okna);
        zaklad.addchild(mur);
        
        
                return zaklad;
	}
        
	public static void main(String[] args) {
		SpringApplication.run(DomApplication.class, args);
	}
}
