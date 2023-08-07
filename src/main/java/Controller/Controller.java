package Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/SparkyWeb")
public class Controller {


    @GetMapping("/UploadFile")
    public String UploadFile(){
        return "index";
    }




}
