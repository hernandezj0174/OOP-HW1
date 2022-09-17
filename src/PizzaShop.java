import pizzaHelper.CS331Pizza;
import pizzaHelper.CS331Toppings;
import pizzaHelper.PizzaShopHelper;

/**
 * This is our top-level class that represents a PizzaShop!
 */
public class PizzaShop extends PizzaShopHelper{
    
    // this declares our instance variable "toppings"
    private CS331Toppings toppings;
    private Baker employee = new Baker();

    /**
     * This is the constructor of the PizzaShop class. You should initialize all your instalce variables here,
     * and be sure to open shop!
     */

    public PizzaShop() {
        super();

        //this initializes our instance variable "toppings"
        this.toppings = new CS331Toppings();

        this.openShop();
        displayShopUpdate("We are open for business");
    }

    /**
     * This method is called automatically when the user clicks "Order 1". Check out
     * the Javadocs for more information.
     */

    @Override
    public void order1() {
        CS331Pizza pizza = this.employee.bakeMushroomPizza();
        displayPrice(pizza);
        displayShopUpdate(employee.statusUpdate());
    }

    /**
     * This method is called automatically when the user clicks "Order 2". Check out
     * the Javadocs for more information.
     */
    @Override
    public void order2() {
        CS331Pizza pizza = this.employee.bakePineapplePizza();
        toppings.addPeppers(pizza);
        displayPrice(pizza);
        displayShopUpdate(employee.statusUpdate());
    }

    /**
     * This method is called automatically when the user clicks "Order 3". Check out
     * the Javadocs for more information.
     */
    @Override
    public void order3(){
        CS331Pizza pizza = this.employee.bakePineapplePizza();
        toppings.addPeppers(pizza);
        toppings.addTomatoes(pizza);
        displayPrice(pizza);
        displayShopUpdate(employee.statusUpdate());
    }

    /**
     * This method is called automatically when the user clicks "Order 4". Check out
     * the Javadocs for more information.
     */
    @Override
    public void order4() {
        CS331Pizza pizza = this.employee.bakeSpinachPizza();
        toppings.addPeppers(pizza);
        toppings.addTomatoes(pizza);
        displayPrice(pizza);
        displayShopUpdate(employee.statusUpdate());
    }
}
