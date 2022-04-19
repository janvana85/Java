public class Mag extends Jednotka{
    private final int hp = 120;
    private final int damage = 20;
    private final int armor = 10;
    private float mv_speed = 25;
    private String name;
    private int magic_damage = 20;
    private final int type;


    Mag(int typ) {

        this.type = typ;


        switch (type){
            case 1: System.out.println("Ohnivy");
            this.magic_damage += 30;
                break;
            case 2: System.out.println("Vodni");
            this.mv_speed += 10;
                break;
        }
    }
}
