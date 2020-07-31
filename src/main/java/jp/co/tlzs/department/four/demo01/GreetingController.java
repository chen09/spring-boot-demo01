package jp.co.tlzs.department.four.demo01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "username") String name) {
        return new Greeting(1, name);
    }

}
