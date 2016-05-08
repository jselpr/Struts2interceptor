/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package login;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author odeen
 */
public class Login extends ActionSupport {
    private String usuario;
    private String clave;
    public Login() {
    }
    
    public String login() throws Exception {
        if("jose".equals(usuario)){
            ActionContext.getContext().getSession().put("usuario", usuario);
            return SUCCESS;
        }else{
            addFieldError("usuario", getText("usuarioincorrecto"));
            return INPUT;
        }
    }
    public String logout() throws Exception {
        ActionContext.getContext().getSession().remove("usuario");
        return SUCCESS;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
