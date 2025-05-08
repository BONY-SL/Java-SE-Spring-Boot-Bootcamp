package org.demo.project.javaee2;

import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/request-header")
public class RequestHeaderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getHeader("name");
        int age = Integer.parseInt(req.getHeader("age"));

        User user = new User(name,age);
        Gson gson = new Gson();

        resp.setContentType("application/json");

        resp.getWriter().println(gson.toJson(user));
    }
}
