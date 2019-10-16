package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author thesh
 */


public class ClickListener implements ActionListener {
    
    private Calculator calc;
    private JLabel label;
    
    public ClickListener(Calculator calc, JLabel label) {
        this.calc = calc;
        this.label = label;
    }
    
    // METHOD. Increase calculator object value by one and sets the value
    // to the label text
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.calc.increase();
        this.label.setText(this.calc.giveValue() + "");
    }
    
}
