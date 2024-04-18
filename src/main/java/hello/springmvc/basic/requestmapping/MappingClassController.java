package hello.springmvc.basic.requestmapping;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
//@Slf4j
public class MappingClassController {
    Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping
    public String memberList(){
        log.info("memberList");
        return "memberList";

    }

    @PostMapping
    public String memberSave(){
        log.info("memberSave");
        return "memberSave";


    }

    @GetMapping("/{userId}")
    public String getMember(@PathVariable String userId){
        log.info("memberGet={}",userId);
        return "memberGet";


    }

    @PatchMapping("/{userId}")
    public String modifyMember(@PathVariable String userId){
        log.info("memberModify={}",userId);
        return "memberModify";


    }
    @DeleteMapping("/{userId}")
    public String deleteMember(@PathVariable String userId){
        log.info("memberDelete={}",userId);
        return "memberDelete";


    }

}
