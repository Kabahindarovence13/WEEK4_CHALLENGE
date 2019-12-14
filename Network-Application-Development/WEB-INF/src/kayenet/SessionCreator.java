package kayenet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionCreator extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    HttpSession session = request.getSession();
    PrintWriter out = response.getWriter();
    String username = request.getParameter("username");
    session.setAttribute("username", username);
    if(username.equals("admin")){
      response.sendRedirect("/Kayenet/AdminDashboard");
    }else{
    //Something else
    }
    //response.setHeader("Refresh","5;welcome");
    out.close();
  }
}
