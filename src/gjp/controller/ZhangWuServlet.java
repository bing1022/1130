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

@WebServlet(name = "ZhangWuServlet")
public class ZhangWuServlet extends HttpServlet {
    //ZhangWuService zws=new ZhangWuService();
    //创建容器



    ApplicationContext app;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        app=new ClassPathXmlApplicationContext("applicationContext.xml");
        ZhangWuService zws=(ZhangWuService)app.getBean("zws");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String type_value=request.getParameter("type_value");
        HttpSession session = request.getSession();
        if (type_value.equals("add"))
        {

            int num= (int)session.getAttribute("shengyu");
            String zwid=request.getParameter("zwid");
            int id=Integer.valueOf(zwid);
            String flname=request.getParameter("flname");
            String money1=request.getParameter("money");
            String zhangHu=request.getParameter("zhangHu");
            String createtime=request.getParameter("createtime");
            String description=request.getParameter("description");
            double money=Double.parseDouble(money1);
            zhangwu zw=new zhangwu(id,flname,money,zhangHu,createtime,description);
            System.out.println(zw);
            int a=zws.add(zw);
            if(a!=0){
                //增加成功
                int now=num-1;
                session.setAttribute("shengyu",now);
                response.getWriter().write("增加成功");
                request.getRequestDispatcher("/index.jsp").forward(request,response);
            }else{
                response.sendRedirect("eero.jsp");
            }
        }else if(type_value.equals("find")){
            String zwid1=request.getParameter("zwid");
            int zwid=Integer.valueOf(zwid1);
            //System.out.println(zwid);
            //拿到从前端输入的id，去数据库进行查找
            zhangwu zw=zws.find(zwid);
            System.out.println(zw);
            //查找到想要的数据后把数据响应给前端
            if(zw!=null){
                request.setAttribute("zw",zw);
                request.getRequestDispatcher("find.jsp").forward(request,response);
            }else{
                response.sendRedirect("eero.jsp");
            }
        }else if (type_value.equals("showall"))
        {
            List<zhangwu> list=zws.showAllZhangWu();
            if (list==null)
            {
                response.sendRedirect(request.getContextPath()+"eero.jsp");
            }
            else
            {
                request.setAttribute("list",list);
                request.getRequestDispatcher("all.jsp").forward(request,response);
            }
        } else if (type_value.equals("delete"))
        {
            int num= (int)session.getAttribute("shengyu");
            String zwid1=request.getParameter("zwid");
            int zwid=Integer.parseInt(zwid1);
            int line=zws.deleteZhangWu(zwid);
            if (line>0){
                int now=num+1;
                session.setAttribute("shengyu",now);
                response.sendRedirect(request.getContextPath()+"index.jsp");
            }
            else
            {
                response.sendRedirect(request.getContextPath()+"err.jsp");
            }

        }else if ("update".equals(type_value))
        {
            String zwid1=request.getParameter("zwid");
            String flname=request.getParameter("flname");
            String money1=request.getParameter("money");
            String zhangHu=request.getParameter("zhangHu");
            String createtime=request.getParameter("createtime");
            String description=request.getParameter("description");
            double money=Double.parseDouble(money1);
            int zwid=Integer.parseInt(zwid1);
            zhangwu zw=new zhangwu(zwid,flname,money,zhangHu,createtime,description);
            int line=zws.updateZhangWu(zw);
            if (line>0){
                response.sendRedirect(request.getContextPath()+"index.jsp");
            }
            else
            {
                response.sendRedirect(request.getContextPath()+"err.jsp");
            }
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
