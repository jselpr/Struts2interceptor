<%@page contentType="text/html" pageEncoding="UTF-8"%>
FORMULARIO: consultar https://struts.apache.org/docs/tag-reference.html
http://www.javatutoriales.com/2011/06/struts-2-parte-1-configuracion.html
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:actionerror/>
<s:actionmessage/>

<s:form action="Formulario" namespace="/admin2" method="POST" enctype="multipart/form-data">
    <s:textfield key="nombre" name="nombre"/>
    <s:password key="clave" key="clave" name="clave"/>
    <s:checkbox key="activo" name="activo"/>    
    <s:checkboxlist key="checkboxList" list="paises" name="paisesCheckbox" value="paisesSeleccionados"/>
    <!--s:datetextfield format="dd/MM/yyyy" name="fechaNacimiento"/-->
    <s:textfield key="fechaNacimiento" name="fechaNacimiento"/>
    <s:textfield key="sueldo" name="sueldo"/>
    <s:select list="paises" name="pais"/>
    <s:radio list="paises" name="favorito"/>
    <s:file name="uploadFichero" accept="*/*"/>
    
    
    <s:submit value="Enviar"/>
</s:form>
