
package com.accenture.controller;

import com.accenture.model.HotelesModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class searchName {

    @RequestMapping(value = "searchName.htm", method = RequestMethod.GET)
    public ModelAndView form() {
        return new ModelAndView("searchName", "command", new HotelesModel());
  
    }
    
}
