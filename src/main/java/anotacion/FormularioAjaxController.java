/*
 * Ver https://struts.apache.org/docs/annotations.html para referencia de anotaciones
 */
package anotacion;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.DateRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.DoubleRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author odeen
 */
public class FormularioAjaxController extends ActionSupport {

    private String pais;
    private List<String> paises = new ArrayList<>();
    {
        paises.add("España");
        paises.add("Francia");
        paises.add("Italia");
        
    }

    @Action(value = "FormularioAjax", results = {
        @Result(name = SUCCESS, location = "formularioajax", type = "tiles"),
        @Result(name = INPUT, location = "formularioajax", type = "tiles")
    })
    public String proceso() {
        
        return "success";
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<String> getPaises() {
        return paises;
    }

    
}
