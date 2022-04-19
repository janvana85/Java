
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {


    public static void main(String[] args) {


    var hra = new Game();

        try {
            hra.nacistHru();
        } catch (IOException e) {
            e.printStackTrace();
        }

        hra.menu();
        hra.vyberTridy();

    try {
        hra.ulozitHru("test",100);
    } catch (IOException e) {
        e.printStackTrace();
    }
        hra.vyberAkce();




    }
    public static int RandomNum(int min, int max){
        return (int) (Math.random() * (max - min) + min);
    }
}
