package Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
@RequestMapping ("/SparkyWeb")
public class Controller {


    @GetMapping("/UploadFile")
    public String UploadFile(){
        return "template";
    }




}
