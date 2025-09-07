package com.example.demo16.servlet;

import com.example.demo16.model.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        User user = new User(email, firstName, lastName);

        HttpSession session = request.getSession();
        session.setAttribute("user", user);

        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        request.setAttribute("currentYear", currentYear);

        String url = "/download.jsp";
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }
}
