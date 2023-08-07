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




}
