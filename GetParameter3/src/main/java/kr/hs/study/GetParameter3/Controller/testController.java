package kr.hs.study.GetParameter3.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;

@Controller
public class testController {
    @GetMapping("/login")
    public String test1(){return "form";}
    @PostMapping("/login")
    public String ex1(HttpServletRequest hp) {
        String id = hp.getParameter("user_id");
        String password = hp.getParameter("user_pass");
        String name = hp.getParameter("user_name");
        String email = hp.getParameter("user_mail");
        String tel = hp.getParameter("user_tel");
        String local = hp.getParameter("user_local");

        System.out.println("id : "+id);
        System.out.println("password : "+password);
        System.out.println("name : "+name);
        System.out.println("email : "+email);
        System.out.println("tel : "+tel);
        System.out.println("local : "+local);

        return "result";
    }
//    @GetMapping("/login")
//    public String ex2(WebRequest wr){
//        String id = wr.getParameter("user_id");
//        String password = wr.getParameter("user_pass");
//        String name = wr.getParameter("user_name");
//        String email = wr.getParameter("user_mail");
//        String tel = wr.getParameter("user_tel");
//        String local = wr.getParameter("user_local");
//
//        System.out.println("id : "+id);
//        System.out.println("password : "+password);
//        System.out.println("name : "+name);
//        System.out.println("email : "+email);
//        System.out.println("tel : "+tel);
//        System.out.println("local : "+local);
//
//        return "result";
//    }
//
//    @GetMapping("/login")
//    public String ex2(@RequestParam("user_id") String id, @RequestParam("user_pass") String password, @RequestParam("user_name") String name, @RequestParam("user_mail") String email, @RequestParam("user_tel") String tel, @RequestParam("user_local") String local ){
//
//        System.out.println("id : "+id);
//        System.out.println("password : "+password);
//        System.out.println("name : "+name);
//        System.out.println("email : "+email);
//        System.out.println("tel : "+tel);
//        System.out.println("local : "+local);
//
//        return "result";
//    }
    //ModelAttribute : dto 사용
}
