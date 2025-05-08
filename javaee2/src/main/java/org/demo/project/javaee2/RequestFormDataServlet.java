package org.demo.project.javaee2;

import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.nio.file.Paths;

@WebServlet(value = "/requst-form-data")
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024,
        maxFileSize = 1024 * 1024 * 10,
        maxRequestSize = 1024 * 1024 * 15
)
public class RequestFormDataServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String ageParam = req.getParameter("age");
        Part file = req.getPart("dp");

        String dp = Paths.get(file.getSubmittedFileName()).getFileName().toString();

        User user = new User(name, Integer.parseInt(ageParam),dp);
        Gson gson = new Gson();

        resp.setContentType("application/json");
        resp.getWriter().println(gson.toJson(user));
    }
}

