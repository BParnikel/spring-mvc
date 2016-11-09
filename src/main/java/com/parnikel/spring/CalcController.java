package com.parnikel.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalcController {
    @RequestMapping("/calculate")
    public ModelAndView calculate(@RequestParam("first") int first, @RequestParam("second") int second) {
        ModelAndView mav = new ModelAndView("displaySum");
        mav.addObject("sum", Integer.toString(first + second));
        return mav;
    }
}
