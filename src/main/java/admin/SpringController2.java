/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import com.opensymphony.xwork2.ActionSupport;
import modelo.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author odeen
 */
@Controller(value = "springController2")
public class SpringController2 extends ActionSupport{
    @Autowired
    private DAO dao;

    public String execute(){
        return "success";
    }
    
    public DAO getDao() {
        return dao;
    }

    public void setDao(DAO dao) {
        this.dao = dao;
    }
    
}
