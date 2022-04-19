import java.util.Calendar;

public class Souboj {

    private final String jmeno_postava;
    private final String jmeno_monstra;
    

    Souboj(String jmeno1,String jmeno2){
        this.jmeno_postava = jmeno1;
        this.jmeno_monstra = jmeno2;
    }

    public void utok(int dmg,double crit){
// TODO: sanci na crit: if chance > 0,8 ? critni ! nic
 System.out.println("Z boje mezi " + jmeno_postava + " a " + jmeno_monstra + " vysel lepe ");


    }
    public void obrana(int sance,int ubranene_poskozeni){
// TODO: sanci na crit: if chance > 0,6 ? bran se ! neubranil se

    }
}
