<%-- 
    Document   : loginresponse
    Created on : 3 Mar, 2024, 10:04:02 AM
    Author     : Chetabist
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
     System.out.println("hello");
    String userid=(String)request.getAttribute("userid");
    String result=(String)request.getAttribute("result");
    if(userid!=null && result!=null)
    {
        System.out.println("hello3");
        HttpSession sess=request.getSession();
        sess.setAttribute("userid", userid);
        String url="";
        if(result.equalsIgnoreCase("user"))
        {
            url="UserControllerServlet;jsessionid="+sess.getId();
        }
        else
        {
            url="VotingControllerServlet;jsessionid="+sess.getId();
        }
//        System.out.println(url);
        out.println(url);
    }
    else
    {
         System.out.println("hello2");
        out.println("error");
    }
%>