package gjp.controller;

import gjp.dao.ZhangWuDao;
import gjp.domain.zhangwu;
import gjp.services.ZhangWuService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name="LoginServlet")
public class LoginServlet extends HttpServlet {





    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");


        int sum=100;
        ZhangWuDao zhangWuDao=new ZhangWuDao();
        List<zhangwu> list=zhangWuDao.ShowAllZhangWu();
        int now=list.size();
        int shengyu=sum-now;
        System.out.println(shengyu);
        HttpSession session = request.getSession();
        session.setAttribute("shengyu",shengyu);


        String name=request.getParameter("name");
        String pass=request.getParameter("pass");
        System.out.println(name+pass);
        ApplicationContext app;
        app=new ClassPathXmlApplicationContext("applicationContext.xml");
        ZhangWuService zws=(ZhangWuService)app.getBean("zws");

        if (true){
            //登录 成功页面
            request.getRequestDispatcher("index.jsp").forward(request,response);


        }


        /*if (zws.panduan(name,pass)){
            //登录 成功页面
            request.getRequestDispatcher("index.jsp").forward(request,response);


        }else{

            response.sendRedirect("eero.jsp");
            //失败页面
        }*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
