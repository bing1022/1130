package gjp.services;

import gjp.dao.ZhangWuDao;
import gjp.domain.zhangwu;

import java.util.List;

//处理具体业务的
public class ZhangWuService {
    ZhangWuDao zwd;

    public ZhangWuDao getZwd() {
        return zwd;
    }

    public void setZwd(ZhangWuDao zwd) {
        this.zwd = zwd;
    }

    public int add(zhangwu zw){
        System.out.println(zw);
        int a=zwd.add(zw);
        return a;
    }
    public zhangwu find(int zwid){

        return zwd.find(zwid);
    }
    public List<zhangwu> showAllZhangWu()
    {
        return zwd.ShowAllZhangWu();

    }
    public int deleteZhangWu(int zwid)
    {
        return zwd.deleteZhangWu(zwid);
    }
    public int updateZhangWu(zhangwu zw)
    {
        return zwd.updateZhangWu(zw);
    }


    public boolean panduan(String name,String pass){

        return zwd.login(name,pass);
    }

}
