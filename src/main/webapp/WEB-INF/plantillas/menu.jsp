<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
MENU
<s:if test="#session.usuario==null">
    <s:a action="loginVista" namespace="/login">Login</s:a>
        <br/>
</s:if>

<s:if test="#session.usuario!=null">
    <s:a action="logout" namespace="/login">Logout</s:a>
        <br/>
</s:if>
<s:a action="spring" namespace="/admin">Spring</s:a>
    <br/>
<s:a action="spring2" namespace="/admin">Spring 2</s:a>
    <br/>
<s:a action="FormularioVista" namespace="/admin2">Formulario</s:a>
<br/>