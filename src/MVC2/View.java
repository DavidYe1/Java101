package MVC2;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by david on 12.10.2016.
 */
public class View extends JFrame{

    private JTextField firstNumber = new JTextField(10);
    private JTextField secondNumber = new JTextField(10);
    private JLabel addLable = new JLabel("+");
    private JLabel subLable = new JLabel("-");
    private JLabel divLable = new JLabel("/");
    private JLabel multLable = new JLabel("*");
    private JButton calcButton = new JButton("=");
    private JTextField calcSolution = new JTextField(10);

    View(){
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(firstNumber);
        calcPanel.add(addLable);
        calcPanel.add(secondNumber);
        calcPanel.add(calcButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);
    }

    public int getFirstNumber(){

        return Integer.parseInt(firstNumber.getText());
    }
    public int getSeconNumber(){

        return Integer.parseInt(secondNumber.getText());
    }
    public int getCalcSolution(){

        return Integer.parseInt(calcSolution.getText());
    }

    public void setCalcSolution(int solution){

        calcSolution.setText(Integer.toString(solution));

    }

    void addCalcListener(ActionListener listenForCalcButton){

        calcButton.addActionListener(listenForCalcButton);

    }

    void displayErrorMessage(String errorMessage){

        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
