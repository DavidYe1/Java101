package MVC2;

/**
 * Created by david on 12.10.2016.
 */
public class Model {
    private int calcValue;

    public  void  add (int firstNumber, int seconNumber){
        calcValue = firstNumber + seconNumber;
    }

    public void  sub (int firstNumber, int secondNumber){
        calcValue = firstNumber - secondNumber;
    }

    public void  mult (int firstNumber, int secondNumber){
        calcValue = firstNumber * secondNumber;
    }

    public void div (int firstNumber, int secondNumber){
        if (secondNumber != 0) {
            calcValue = firstNumber / secondNumber;
        }else{
            System.out.println("Null division not allowed!");
        }
    }
    public int getCalcValue() {
        return calcValue;
    }
}
