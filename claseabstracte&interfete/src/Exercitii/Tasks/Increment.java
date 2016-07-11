package Exercitii.Tasks;

/**
 * Created by mipopescu on 7/11/2016.
 */
public class Increment implements Task{
    static int contor;

    public Increment(){
        contor = 0;
    }

    @Override
    public void execute() {
        contor++;
        System.out.println("Valoarea curenta a contorului e " + contor);
    }
}
