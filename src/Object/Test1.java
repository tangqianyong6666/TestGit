package Object;

/**
 * @author 摩西摩西
 * @date 2021/5/19  17:32
 **/
public class Test1 {
    public static void main(String[] args) {
         Test1 t1=new Test1();
         Test1 t2=t1;
         Test1 t3=t1;
         t3=new Test1();
        System.out.println(t3.equals(t1));

       }
    }


