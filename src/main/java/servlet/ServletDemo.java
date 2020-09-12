package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ServletDemo extends HttpServlet {

    private String message;

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, ServletException, IOException {
        System.out.println("doPost:");
//        // TODO Auto-generated method stub
//        super.doPost(req, resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet:");
//        resp.setContentType("text/html");
//        PrintWriter writer = resp.getWriter();
//        writer.write("<h1>" + message + "</h1>");
//        destroy();
    }
    @Override
    public void init() throws ServletException {
        System.out.println("init:");
//        message = "Hello World , Nect To Meet You: " + System.currentTimeMillis();
//        System.out.println("servlet初始化……");
//        super.init();
    }
    @Override
    public void destroy(){
        System.out.println("destory:");
//        System.out.println("destory:"+"servlet销毁！");
//        super.destroy();
    }

    public void doPut(){
        System.out.println("doPut:");
    }

    public void doDelete(){
        System.out.printf("doDelete:");
    }

    public void doHead(){
        System.out.println("doHead:");
    }
}