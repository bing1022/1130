package gjp.tools;
import com.mchange.v2.c3p0.ComboPooledDataSource;



public class Tool {
    private static ComboPooledDataSource com;
    static{
        com=new ComboPooledDataSource();
    }
    public static ComboPooledDataSource getCon(){
        return com;
    }
}
