package Object;

/**
 * @author 摩西摩西
 * @date 2021/8/3  11:58
 **/
public class GiantDragon {
  private GiantDragon(){
  }

  private static GiantDragon intance=null;

  public static GiantDragon getInstance(){
      if (intance==null)
          intance=new GiantDragon();
      return intance;
  }


}
class pu{
    public static void main(String[] args) {
        GiantDragon g1=GiantDragon.getInstance();
        GiantDragon g2=GiantDragon.getInstance();
        GiantDragon g3=GiantDragon.getInstance();

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
    }
}
