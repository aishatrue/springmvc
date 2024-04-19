package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {
    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1(){
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data", "hello!");
        return mav;

    }

    @RequestMapping("/response-view-v2")
    //@Controller면서 String을 반환하면 이게 뷰의 논리이름이 된다.
    public String responseViewV2(Model model){
        model.addAttribute("data", "meow!");
        return "response/hello";

    }

    @RequestMapping("/response/hello")
    //@Controller면서 String을 반환하면 이게 뷰의 논리이름이 된다.
    public void responseViewV3(Model model){
        model.addAttribute("data", "meow!");


    }

}
