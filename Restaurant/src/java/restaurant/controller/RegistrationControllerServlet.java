/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.controller;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import restaurant.dao.RegistrationDAO;
import restaurant.dto.UserDetails;

/**
 *
 * @author Chetabist
 */
public class RegistrationControllerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       RequestDispatcher rd=null;
       UserDetails user=new UserDetails();
       user.setUserid(request.getParameter("userid"));
       user.setPassword(request.getParameter("password"));
       user.setEmail(request.getParameter("email"));
       user.setMobile(Long.parseLong(request.getParameter("mobile")));
       user.setUsername(request.getParameter("username"));
       try
       {
           boolean result=false,userfound=false;
           if(!RegistrationDAO.searchUser(user.getUserid()))
           {
               result=RegistrationDAO.regsterUser(user);
           }
           else
                    userfound=true;
             request.setAttribute("result", result);
             request.setAttribute("userfound", userfound);
             request.setAttribute("username", user.getUsername());
             rd=request.getRequestDispatcher("registrationresponse.jsp");
       }           
       catch(SQLException ex)
       {
           ex.printStackTrace();
           request.setAttribute("Exception", ex);
           rd=request.getRequestDispatcher("showexception.jsp");
       }
       finally
       {
           rd.forward(request, response);
       }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
