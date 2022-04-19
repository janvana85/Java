import java.io.*;
import java.util.Scanner;

public class Game {

    private String jmeno;
    private int trida;
    String[] postavy = {"Rytir","Strelec","Lucistnik","Mag"};
    String[] monstra = {"Gromp","Golem","Vlci","Monstra4"};
//TODO dodelat mostrum


    public String getJmeno() {
        return jmeno;
    }


    public void menu(){

        var vstup = new Scanner(System.in);


        System.out.println("Vitetej v bojove videohre!");
        System.out.println("Zadejte svuj nickname: ");
        jmeno = vstup.nextLine();
    }

    public void vyberTridy(){

        var vstup = new Scanner(System.in);

        System.out.println("Tridy k dispozici: ");

        for (int i = 0; i < postavy.length; i++){

            System.out.println("    " + (i+1) + ". "+ postavy[i]);
        }

        do {
            System.out.println("Zvolte si tridu!");
            trida = vstup.nextInt();
        }while (trida > 4 || trida < 0);



        switch (trida){
            case 1: var Rytir = new Rytir();
                System.out.println("Ke hre byl vybran rytir jmenem " + jmeno);
                System.out.println("Rytir ma "+ Rytir.getDamage() + " damage");
                break;

            case 2: var Strelec = new Strelec();
                System.out.println("Ke hre byl vybran strelec jmenem " + jmeno);
                break;

            case 3: var Lucistnik = new Lucistnik();
                System.out.println("Ke hre byl vybran lucistnik jmenem " + jmeno);
                break;

            case 4: var Mag = new Mag(0);
                System.out.println("Ke hre byl vybran mag jmenem " + jmeno);
                break;

            default: var Jednotka = new Jednotka();
                break;
        }
    }

    public void vyberAkce(){
        System.out.println("Zvol co chec delat? ");
        System.out.println("    1. Utocit ");
        System.out.println("    2. Pokusit se branit se ");
        System.out.println("    Jaka koliv jina klavesa pro pokus o utek");

      
        
        var vstup = new Scanner(System.in);
        int vyber = vstup.nextInt();
        switch (vyber){
            case 1: var utok = new Souboj(jmeno, monstra[randomNum(0, 4)]);
            utok.utok(50, 0.7);
                break;
            case 2:
                break;
                default:
                if(randomNum(0, 10) < 4){
                    System.out.print("Zkusil si utect od souboje ale povedlo se to");
                }else{
                    System.out.print("Zkusil si utect od souboje ale nepovedlo se to");
                }
        }
    }

    public void ulozitHru(String name,int xp) throws IOException {

      try {
        BufferedWriter writer = new BufferedWriter(new FileWriter("src\\name_pass.txt"));

        writer.write("Jmeno:    " + name + " \nXP:       " + xp);
        writer.close();

      } catch (IOException e) {
          e.printStackTrace();
      }

    }

    public void nacistHru() throws IOException{
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src\\name_pass.txt"));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public int randomNum(int min, int max){
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    
}
