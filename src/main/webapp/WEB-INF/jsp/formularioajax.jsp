<%@page contentType="text/html" pageEncoding="UTF-8"%>
FORMULARIO: consultar https://struts.apache.org/docs/tag-reference.html
http://www.javatutoriales.com/2011/06/struts-2-parte-1-configuracion.html
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<s:form action="FormularioAjax" namespace="/admin2" method="POST" enctype="multipart/form-data">
    <sx:autocompleter  name="pais" list="paises" />
    <sx:submit value="Enviar Ajax"/>
    
    
    <s:submit value="Enviar"/>
</s:form>
