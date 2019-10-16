package clicker.applicationlogic;

/**
 *
 * @author thesh
 */
public class PersonalCalculator implements Calculator {
    
    private int value;
    
    public PersonalCalculator() {
       this.value = 0;
    }
    
    // METHOD. Returns current value of calculator
    public int giveValue() {
        return this.value;
    }
    
    // METHOD. Increase value by one
    public void increase() {
        this.value++;
    }
    
    
}
