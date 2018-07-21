package com.sandbox50572.servlettest;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
*Сервлет просто на любой запрос возвращает html с сообщением: Hello from Simple Servlet.
 */

public class SimpleServlet extends HttpServlet {

    private String responseTemplate =
            "<html>\n" +
                    "<body>\n" +
                    "<h2>Hello from Simple Servlet</h2>\n" +
                    "</body>\n" +
                    "</html>";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.process(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.process(request, response);
    }

    private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setStatus(200);
        response.getWriter().write(responseTemplate);
    }
}