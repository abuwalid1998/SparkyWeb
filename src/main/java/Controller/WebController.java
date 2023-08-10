package Controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping ("/SparkyWeb")
public class WebController {


    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/UploadFile")
    public String UploadFile(){
        return "template";
    }

    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/download")
    public String Downloadfile(){
        return "Download";
    }


    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/StartSpark")
    public String StartSpark(){
        return "StartSpark";
    }

    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/home")
    public String Home(){
        return "home";
    }



}
