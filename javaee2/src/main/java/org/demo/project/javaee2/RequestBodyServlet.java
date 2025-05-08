package org.demo.project.javaee2;


import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;

@WebServlet(value = "/request-body")
public class RequestBodyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        BufferedReader reader = req.getReader();

        Gson gson = new Gson();

        User user = gson.fromJson(reader, User.class);

        resp.setContentType("application/json");

        resp.getWriter().println(gson.toJson(user));
    }
}
