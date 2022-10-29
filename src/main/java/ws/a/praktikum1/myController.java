/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws.a.praktikum1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 *
 * @author ASUS
 */

@Controller
public class myController {
    
    @RequestMapping("/hello")
    @ResponseBody
    public String hai(
        @RequestParam(value = "varA") String isipertama,
        @RequestParam(value = "varB") String isikedua){
        
        String rslt ="";
        
        if(isipertama.equals("ami") && isikedua.equals( anobject:"tiara"));
        return isipertama +" "+ isikedua;
        
    }
}
