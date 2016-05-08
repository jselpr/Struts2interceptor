/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 *
 * @author usuario
 */
public class InterceptorSeguridad extends AbstractInterceptor{

    @Override
    public void destroy() {
        
    }

    @Override
    public void init() {
        
    }

    @Override
    public String intercept(ActionInvocation ai) throws Exception {
        System.out.println(ai.getAction().getClass().getName());
        
        if(ai.getAction()instanceof login.Login ||
                ai.getInvocationContext().getSession().containsKey("usuario")){
            return ai.invoke();
        } else{
            return Action.LOGIN;
        }
        
    }
    
}
