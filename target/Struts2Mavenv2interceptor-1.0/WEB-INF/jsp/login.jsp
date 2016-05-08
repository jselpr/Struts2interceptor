<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<s:actionerror/>
<s:form action="login" namespace="/login" validate="true" >
    <s:textfield key="usuario" name="usuario"/>
    <s:password key="clave" name="clave"/>
    <s:submit key="enviar"/>
</s:form>