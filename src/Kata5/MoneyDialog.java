package Kata5;

import java.awt.PopupMenu;
import javax.swing.JPanel;
import javax.swing.JTextField;
class MoneyDialog extends JPanel {

    public MoneyDialog() {
        super();
        add(CReateTextField());
        add(new CurrencyDialog());
    }

    private JTextField CReateTextField() {
        return new JTextField(10);
    }
    
}
