/*
 * The MIT License
 *
 * Copyright 2016 Hugo.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.hugoangeles.demospringhibernate.controller;

import com.hugoangeles.demospringhibernate.entity.Contact;
import com.hugoangeles.demospringhibernate.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Hugo
 */
@Controller
public class HomeController {
    
    @Autowired
    private ContactService contactService;
    
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    
    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newContact(){
        return "new";
    }
    
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public ModelAndView saveContact(@RequestParam("firstname") String firstname,
                                    @RequestParam("lastname") String lastname,
                                    @RequestParam("email") String email,
                                    @RequestParam("telephone") String telephone
    ) {
        ModelAndView mv = new ModelAndView("new");
        Contact contact = new Contact();
        contact.setFirstname(firstname);
        contact.setLastname(lastname);
        contact.setEmail(email);
        contact.setTelephone(telephone);
        
        try {
            contactService.save(contact);
            mv.addObject("msg", "Contact saved");
        } catch (Exception e) {
            mv.addObject("msg", "An error occurred");
        }
        return mv;
    }
    
    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView("list");
        mv.addObject("contacts", contactService.listAll());
        return mv;
    }
    
}
