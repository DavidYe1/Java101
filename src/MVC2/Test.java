package MVC2;

/**
 * Created by david on 12.10.2016.
 */
public class Test {

    public static void main(String[] args) {

        View theView = new View();

        Model theModel = new Model();

        Contoller theController = new Contoller(theView, theModel);

        theView.setVisible(true);
    }
}
