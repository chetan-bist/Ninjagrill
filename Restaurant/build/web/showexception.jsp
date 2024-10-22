<%-- 
    Document   : showexception
    Created on : 2 Mar, 2024, 7:19:21 PM
    Author     : Chetabist
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  Exception ex=(Exception)request.getAttribute("Exception");
  System.out.println("Exception is :"+ex);
  out.println("Some exception occurred"+ex.getMessage());
%>
