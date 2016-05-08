<%-- 
    Document   : plantilla
    Created on : 05-feb-2014, 1:42:16
    Author     : odeen
--%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Genera el script para cargar dojo (ajax para struts 2) -->
        <sx:head/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><tiles:insertAttribute name="titulo"/></title>
        <style>
            #logo{ width: 800px; height: 100px; background-color: black;color: white}
            #menu{ width: 100px; min-height: 600px; background-color: #CACACA;float:left}
            #contenido{ width: 700px; background-color: white;}
            #pie{ width: 800px; background-color: black;color: white;clear: left;text-align: center}
        </style>
    </head>
    <body>
        <div id="logo"><tiles:insertAttribute name="logo"/></div>
        <div>
            <div id="menu"><tiles:insertAttribute name="menu"/></div>
            <div id="contenido"><tiles:insertAttribute name="contenido"/></div>
        </div>
        <div id="pie"><tiles:insertAttribute name="pie"/></div>
    </body>
</html>
