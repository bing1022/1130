package gjp.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import gjp.domain.userss;
import gjp.domain.zhangwu;
import gjp.tools.Tool;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

//操作数据库的
public class ZhangWuDao {
    private ComboPooledDataSource com=null;
    private QueryRunner qr=null;
    //往数据库进行增加
    public int add(zhangwu zw){
        int a=0;
        //获得数据库连接
        com= Tool.getCon();
        //获得可以操作数据库的对象
        qr=new QueryRunner(com);
        String sql="insert into gjp_zhangwu values(?,?,?,?,?,?)";
        try {
           a=qr.update(sql,zw.getZwid(),zw.getFlname(),zw.getMoney(),zw.getZhangHu(),zw.getCreatetime(),zw.getDescription());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(qr);
        return a;
    }
    //从数据库进行查找
    public zhangwu find(int zwid){
        zhangwu zw=null;
        //获得数据库连接
        com= Tool.getCon();
        //获得可以操作数据库的对象
        qr=new QueryRunner(com);
        String sql="select * from gjp_zhangwu where zwid=?";
        try {
            zw=qr.query(sql,new BeanHandler<>(zhangwu.class),zwid);
            System.out.println(zw);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return zw;
    }

    public List<zhangwu> ShowAllZhangWu()
    {
        //获得数据库连接
        com= Tool.getCon();
        //获得可以操作数据库的对象
        qr=new QueryRunner(com);
        List<zhangwu> list=null;
        String sql="select * from gjp_zhangwu";
        try {
            //list=qr.query(sql,new BeanListHandler<>(zhangwu.class));
            list=qr.query(sql,new BeanListHandler<>(zhangwu.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }
    public int deleteZhangWu(int zwid)
    {
        //获得数据库连接
        com= Tool.getCon();
        //获得可以操作数据库的对象
        qr=new QueryRunner(com);
        int line=0;
        String sql="delete from gjp_zhangwu where zwid=?";
        try {
            line=qr.update(sql,zwid);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return line;
    }
    public int updateZhangWu(zhangwu zw)
    {
        //获得数据库连接
        com= Tool.getCon();
        //获得可以操作数据库的对象
        qr=new QueryRunner(com);
        int line=0;
        String sql="update gjp_zhangwu set flname=?,money=?,zhangHu=?,createtime=?,description=? where zwid=?";
        try {
            line=qr.update(sql,zw.getFlname(),zw.getMoney(),zw.getZhangHu(),zw.getCreatetime(),zw.getDescription(),zw.getZwid());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return line;
    }

    //判断用户登录

    public boolean login(String name,String pass){
        userss u1=null;
        //获得数据库连接
        com= Tool.getCon();
        //获得可以操作数据库的对象
        qr=new QueryRunner(com);
        String sql="select * from userss where u_name=? and u_pass=?";
        try {
            u1=qr.query(sql,new BeanHandler<>(userss.class),name,pass);
            System.out.println(u1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u1!=null;
    }


}
