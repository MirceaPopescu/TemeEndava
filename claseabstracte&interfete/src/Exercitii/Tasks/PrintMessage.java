package Exercitii.Tasks;

/**
 * Created by mipopescu on 7/11/2016.
 */
public class PrintMessage implements Task{
    String message;

    public PrintMessage(String string){
        this.message = string;
    }

    PrintMessage(){
        this.message = "This is a dummy string";
    }

    @Override
    public void execute() {
        System.out.println(this.message);
    }
}
