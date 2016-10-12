package MVC2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by david on 12.10.2016.
 */
public class Contoller {

    private View theView;
    private Model theModel;

    public  Contoller(View theView, Model theModel){

        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalcListener(new CalcListener());
    }

    class  CalcListener implements ActionListener{

        /**
         * Invoked when an action occurs.
         *
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;

            try {

                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSeconNumber();

                theModel.add(firstNumber, secondNumber);

                theView.setCalcSolution(theModel.getCalcValue());
            }catch (NumberFormatException ex){
                theView.displayErrorMessage("Need 2 Integers");
            }
        }
    }
}
