<%@page contentType="text/html" pageEncoding="UTF-8"%>
FORMULARIO
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:actionerror/>
<s:actionmessage/>
Recibido:
Nombre: <s:property value="nombre"/><br/>
Clave: <s:property value="clave"/><br/>
Activo: <s:property value="activo"/><br/>
FechaNacimiento: <s:property value="fechaNacimiento"/>&nbsp;<s:date name="fechaNacimiento" format="dd/MM/yyyy" /><br/>
PaisesSeleccionados: <s:property value="paisesCheckbox"/><br/>
Pais: <s:property value="pais"/><br/>
Favorito: <s:property value="favorito"/><br/>
Sueldo: <s:property value="sueldo"/><br/>

uploadFichero: <s:property value="uploadFicheroFileName"/>--<s:property value="uploadFicheroContentType"/><br/>

