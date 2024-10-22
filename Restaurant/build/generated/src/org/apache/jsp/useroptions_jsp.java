package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class useroptions_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ninjagrill</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../styles/homepage.css\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Cedarville+Cursive&family=Kode+Mono:wght@400..700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/31e996a355.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"jsscript/useroptions.js\"></script>\n");
      out.write("        <script src=\"jsscript/jquery.js\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String userid=(String)session.getAttribute("userid");
            if(userid==null)
            {
                response.sendRedirect("accessdenied.html");
                return;
            }
            StringBuffer displayBlock=new StringBuffer("");
            displayBlock.append("<header><div class='navbar'><div class='nav-logo'><div class='logo'></div></div>"+
                "<div class='add-icon'><i class='fa-solid fa-bars fa-2xl ' onclick='pointMenu()'></i></div></div>"+
                 "<!-- Drop-down-menu --><div class='menuWrap' id='pMenu'><div class='menu'><a href='#'>"+
                    "<i class='fa-solid fa-user' style = 'color : #ffffff;'></i><p>Personal details</p></a>"+
                    "<a href='login.html'><i class='fa-solid fa-arrow-right-from-bracket' style='color: #ffffff;'></i><p>Log out</p>"+
                    "</a></div></div></header>");
            displayBlock.append("<div class='hero-section'><div class='hero-img'><img src='../images/heroimage.png'></div></div>");
            displayBlock.append("<div class='panel'><p style='color: #ffffff;'><u style='color: #ffffff;'>Today's Special</u></p><div class='all-day-option'><h3>Breakfast</h3>"+
                    "<h3>Lunch</h3><h3>Dinner</h3><h3>Dessert</h3></div></div>");
            displayBlock.append("<div class='todaySpecial'><div class='food-container'><!-- Breakfast-column --><div class='col1 col'>"+
                    "<div class='food-item'><a href='#'><img src='../images/pic1.jpg' alt=''><h4>Dosa</h4><p>Starting at Rs.90/-</p></a>"+
                    "</div><div class='food-item'><a href='#'><img src='../images/pic2.jpeg' alt=''><h4>Waffles</h4><p>Starting at Rs.120/-</p></a>"+
                    "</div><div class='food-item'><a href='#'><img src='../images/pic3.jpg' alt=''><h4>Avacado Egg Toast</h4><p>Starting at Rs.80/-</p></a>"+
                    "</div><div class='food-item'><a href='#'><img src='../images/pic4.jpg' alt=''><h4>Green Salad</h4><p>Starting at Rs.70/-</p></a>"+
                    "</div></div><!-- Lunch-column --><div class='col2 col'><div class='food-item'><a href='#'><img src='../images/pic7.webp' alt=''>"+
                    "<h4>Chicken platter</h4><p>Starting at Rs.350/-</p></a></div><div class='food-item'><a href='#'><img src='../images/pic8.jpg' alt=''>"+
                    "<h4>Veg Platter</h4><p>Starting at Rs.200/-</p></a></div><div class='food-item'><a href='#'><img src='../images/pic9.webp' alt=''>"+
                    "<h4>Butter Chicken</h4><p>Starting at Rs.500/-</p></a></div><div class='food-item'><a href='#'><img src='../images/pic10.webp' alt=''>"+
                    "<h4>Panner Tikka Masala</h4><p>Starting at Rs.650/-</p></a></div></div><!-- Dinner-column --><div class='col3 col'><div class='food-item'>"+
                    "<a href='#'><img src='../images/pic11.webp' alt=''><h4 style='text-align: center;'>Pasta with Italian White Sauce</h4><p/a>>Starting at Rs.90/-</p></a>"+
                    "</div><div class='food-item'><a href='#'><img src='../images/pic12.jpg' alt=''><h4>Palak Panner</h4><p>Starting at Rs.350/-</p></a>"+
                    "</div><div class='food-item'><a href='#'><img src='../images/pic13.jpg' alt=''><h4>Burrito</h4><p>Starting at Rs.120/-</p></a></div>"+
                    "<div class='food-item'><a href='#'><img src='../images/pic14.webp' alt=''><h4>Punjabi Style Rajma Rice</h4><p>Starting at Rs.150/-</p></a>"+
                    "</div></div><!-- Dessert-column --><div class='col4 col'><div class='food-item'><a href='#'><img src='../images/pic15.jpg' alt=''>"+
                    "<h4>Red Velvet Cake</h4><p>Starting at Rs.60/-</p></a></div><div class='food-item'><a href='#'><img src='../images/pic16.jpg' alt=''>"+
                    "<h4>Pistachio Icecream</h4><p>Starting at Rs.90/-</p></a></div><div class='food-item'><a href='#'><img src='../images/pic18.jpg' alt=''>"+
                    "<h4>Macarons</h4><p>Starting at Rs.69/-</p></a></div><div class='food-item'><a href='#'><img src='../images/pic17.jpg' alt=''>"+
                    "<h4>Choclate Milkshake</h4><p>Starting at Rs.110/-</p></a></div></div></div><!-- todaySpecial dishes --><div class='box1 box'>"+
                    "<a href='#'><img src='../images/chickenbbq.jpg' alt=''><div class='img-text'><h2>50% OFF</h2><p>BBQ Chicken</p></div></a></div>"+
                    "<div class='box2 box'><a href='#'><img src='../images/pizza.jpg' alt=''><div class='img-text'><h2>40% OFF</h2><p>Double Cheese Chicken Pizza</p>"+
                    "</div></a></div><div class='box3 box'><a href='#'><img src='../images/sweet.png' alt=''><div class='img-text'><h2>60% OFF</h2><p>Rasmalai</p>"+
                    "</div></a></div><div class='box4 box'><a href='#'><img src='../images/hotwings.jpg' alt=''><div class='img-text'><h2>45% OFF</h2><p>Hot Wings</p></div></a></div></div>");
            displayBlock.append("<footer><div class='copywrite'><h3>Thanks for visiting.</h3><br> <h4>Contact us at ninjagrill@gmail.com</h2></div></footer>");
            displayBlock.append("<script>let pMenu=document.getElementById('pMenu');function pointMenu(){"+
                    "pMenu.classList.toggle('open-menu');}</script>");

            out.println(displayBlock);
         
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
