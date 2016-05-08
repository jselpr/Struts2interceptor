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
import java.util.Date;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author odeen
 */
public class FormularioController extends ActionSupport {

    private File uploadFichero;
    private String uploadFicheroFileName;
    private String uploadFicheroContentType;

    private String nombre;
    private String clave;
    private Boolean activo;
    private Date fechaNacimiento;
    private Float sueldo;
    private String trabajo;
    private String pais;
    private String favorito;

    private String[] paises = {getText("Spain"), getText("Mexico"), getText("Germany")};
    private String[] paisesSeleccionados;
    private String paisesCheckbox;

    @Action(value = "FormularioVista", results = {
        @Result(name = SUCCESS, location = "recibido", type = "tiles"),
        @Result(name = INPUT, location = "formulario", type = "tiles")
    })
    public String vista() {
        paisesSeleccionados = paisesCheckbox.split(", ");
        return "success";
    }

    @Action(value = "Formulario",
            results = {
                @Result(name = SUCCESS, location = "recibido", type = "tiles"),
                @Result(name = INPUT, location = "formulario", type = "tiles")
            },
            interceptorRefs = {
                @InterceptorRef(value = "fileUpload", params = {"maximumSize", "2097152"}),
                @InterceptorRef(value = "miStackInterceptores")
            }
    )
    public String procesado() {
        paisesSeleccionados = paisesCheckbox.split(", ");
        this.addActionMessage("Ejecutado correctamente...Message");
        //this.addActionError("Ejecutado correctamente...Error");
        //this.addFieldError("clave", "Error en la clave ..");
        return "success";
        //return "input";
    }

    public String getNombre() {
        return nombre;
    }

    @RequiredStringValidator(message = "Introduce el nombre.")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    @DateRangeFieldValidator(message="1/1/1900 como mínimo", dateFormat = "dd/MM/yyyy", min = "01/01/1900")
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Float getSueldo() {
        return sueldo;
    }

    @RequiredFieldValidator(key = "introduce.sueldo")
    @DoubleRangeFieldValidator(message="Entre 0 y 100",maxInclusive = "100", minInclusive = "0")
    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String[] getPaises() {
        return paises;
    }

    public void setPaises(String[] paises) {
        this.paises = paises;
    }

    public String[] getPaisesSeleccionados() {
        return paisesSeleccionados;
    }

    public void setPaisesSeleccionados(String[] paisesSeleccionados) {
        this.paisesSeleccionados = paisesSeleccionados;
    }

    public String getPaisesCheckbox() {
        return paisesCheckbox;
    }

    public void setPaisesCheckbox(String paisesCheckbox) {
        this.paisesCheckbox = paisesCheckbox;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFavorito() {
        return favorito;
    }

    public void setFavorito(String favorito) {
        this.favorito = favorito;
    }

    public File getUploadFichero() {
        return uploadFichero;
    }

    public void setUploadFichero(File uploadFichero) {
        this.uploadFichero = uploadFichero;
    }

    public String getUploadFicheroFileName() {
        return uploadFicheroFileName;
    }

    public void setUploadFicheroFileName(String uploadFicheroFileName) {
        this.uploadFicheroFileName = uploadFicheroFileName;
    }

    public String getUploadFicheroContentType() {
        return uploadFicheroContentType;
    }

    public void setUploadFicheroContentType(String uploadFicheroContentType) {
        this.uploadFicheroContentType = uploadFicheroContentType;
    }

}
