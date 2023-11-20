import java.util.Scanner;
public class CalculatorView {
    private Scanner scanner;

    public CalculatorView(){
        scanner=new Scanner(System.in);
    }
    public void displayResult(int result){
        System.out.println("Результат:"+result);
    }
    public int getUserInput(String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }
}
