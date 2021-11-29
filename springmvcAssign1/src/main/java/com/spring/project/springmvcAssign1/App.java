package com.spring.project.springmvcAssign1;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
@Controller  
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Hello world!
 *
 */
public class App 
@RequestMapping("/hello")  
public String redirect()    
{  
    return "viewpage";  
}   
}

@RequestMapping("/helloagain")  
public String display()  
{  
return "final";  
}  
}  