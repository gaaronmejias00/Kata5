package Kata5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MoneyCalculatorFrame extends JFrame {

    public MoneyCalculatorFrame() {
        setTitle("Money Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension (300, 300));
        createCmponents();
        setVisible(true);
    }

    private void createCmponents() {
        add(CreateExchangeDialog());
        add(CreateToolbar(), BorderLayout.SOUTH);
    }

    private JPanel CreateExchangeDialog() {
        JPanel panel = new JPanel();
        panel.add(new MoneyDialog());
        panel.add(new CurrencyDialog());
        return panel;
    }

    private JPanel CreateToolbar() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panel.add(createCalculateButton());
        panel.add(createCloseButton());
        return panel;
    } 

    private JButton createCalculateButton() {
        JButton button = new JButton ("Calculate");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Calculating");
            }
        });
        return button;
        
    }
    
        private JButton createCloseButton() {
        JButton button = new JButton ("Close");
        button.addActionListener(new ActionListener() {
                        
            @Override
            public void actionPerformed(ActionEvent e) {
                MoneyCalculatorFrame.this.dispose();
            }
        });
        return button;
    }
}
