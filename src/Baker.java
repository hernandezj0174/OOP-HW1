import pizzaHelper.CS331Pizza;

public class Baker {
    
    private static int numPizzas;

    public Baker() {
        numPizzas = 0;
    }

    public String statusUpdate() {
        return "The baker has made " + String.valueOf(numPizzas) + " pizzas.";
    }

    public CS331Pizza bakeMushroomPizza() {
        CS331Pizza m_pizza = new CS331Pizza();
        m_pizza.addMushrooms();
        numPizzas++;
        return m_pizza;
    }

    public CS331Pizza bakePineapplePizza() {
        CS331Pizza m_pizza = new CS331Pizza();
        m_pizza.addPineapple();
        numPizzas++;
        return m_pizza;
    }

    public CS331Pizza bakeSpinachPizza() {
        CS331Pizza m_pizza = new CS331Pizza();
        m_pizza.addSpinach();
        numPizzas++;
        return m_pizza;
    }
}
