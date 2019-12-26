/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.mii.bootcamp.exercise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DELL
 */
@RestController
public class HomeController {
   
    @RequestMapping("/dd")
    public String getErrorPath() {
        // TODO Auto-generated method stub
        return "Hai kawan";
    }
}
