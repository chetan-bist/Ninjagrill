<%-- 
    Document   : registrationresponse
    Created on : 3 Mar, 2024, 9:03:46 AM
    Author     : Chetabist
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    boolean result=(boolean)request.getAttribute("result");
    boolean userfound=(boolean)request.getAttribute("userfound");
    if(userfound==true)
        out.println("uap");
    else if(result==true)
        out.println("success");
    else
        out.println("error");
 %>
