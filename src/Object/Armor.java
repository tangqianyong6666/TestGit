package Object;

/**
 * @author 摩西摩西
 * @date 2021/5/21  15:23
 **/
public class Armor extends Item{
    int ac;

    public Armor() {
        System.out.println("aadada");
    }
    public Armor(int ac) {
        this.ac=ac;
    }
    public Armor(String name, int price, int ac) {
        this(ac);
        super.name=name;
        super.price=price;
    }

    public static void main(String[] args) {
        Armor buJia=new Armor();
        buJia.name="布甲";
        buJia.price=300;
        buJia.ac=15;
        Armor suoZiJia=new Armor("锁子甲",500,40);
        System.out.println(buJia.name+" "+buJia.price+" "+buJia.ac);
        System.out.println(suoZiJia.name+" "+suoZiJia.price+" "+suoZiJia.ac);
    }
}
