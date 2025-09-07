package com.example.demo16.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        String file = request.getParameter("file");
        if (file == null) {
            response.sendRedirect("index.jsp");
            return;
        }

        String path = getServletContext().getRealPath("/music/" + file);
        File downloadFile = new File(path);

        if (!downloadFile.exists()) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        response.setContentType("audio/mpeg");
        response.setHeader("Content-Disposition", "attachment;filename=" + downloadFile.getName());

        try (FileInputStream in = new FileInputStream(downloadFile);
             OutputStream out = response.getOutputStream()) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }
    }
}
