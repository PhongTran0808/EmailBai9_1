package com.example.demo16.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.*;

public class AlbumServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        List<String> albums = new ArrayList<>();
        albums.add("86 (the band) - True Life Songs and Pictures");
        albums.add("Paddlefoot - The First CD");
        albums.add("Paddlefoot - The Second CD");
        albums.add("Joe Rut - Genuine Wood Grained Finish");

        request.setAttribute("albums", albums);


        String url = "/index.jsp";
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }
}
