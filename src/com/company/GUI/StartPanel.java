package com.company.GUI;


import com.company.Model.Produkt;
import com.db4o.ObjectContainer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class StartPanel extends JPanel implements MainFrameShop {

    private final JFrame frame;
    protected static JButton buttonlogin;
    protected static JButton buttonRegister;
    private JPanel buttonPanel;
    private JPanel mainPanel;
    private LogoPanel logoPanel;
    ObjectContainer db;
    private  JFrame mainframe;
    private StartPanel startPanel;
    int intQuantity;
    java.util.List<Produkt> pro;
    public StartPanel(JFrame frame, ObjectContainer db, int intQuantity, List<Produkt> pro){

        super();
        this.pro= pro;
        this.intQuantity = intQuantity;
        System.out.println(intQuantity);
        this.db= db;
        this.frame = frame;
        createPanel();

    }

    private void createPanel(){

        mainPanel = new JPanel();
        mainPanel.setPreferredSize(frameSize);
        mainPanel.setLayout(new GridLayout(2,1));
        mainPanel.setBackground(Color.LIGHT_GRAY);

        logoPanel = new LogoPanel( );
        logoPanel.setBounds(10,10,700,700);
        logoPanel.setMaximumSize(frameSize);

        buttonlogin = new JButton("Produkty");
        buttonlogin.setMaximumSize(new Dimension(100, 30));
        buttonlogin.setSize(new Dimension(100, 20));
        buttonlogin.setBackground(Color.GRAY);
        buttonlogin.setFont(myFont);
        buttonlogin.setForeground(Color.black);
        buttonlogin.addActionListener(new ProductListener());

        buttonPanel = new JPanel(new GridLayout(4,1, 20, 20));
        buttonPanel.setBorder(new EmptyBorder(100,100,20,100));
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.add(buttonlogin);

        mainPanel.add(logoPanel);
        mainPanel.add(buttonPanel);

        this.add(mainPanel);
    }

    class ProductListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            System.out.println("I am working!");

            SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {

                        JPanel productPanel= new ProductPanel(frame, db, intQuantity, pro);
                        frame.getContentPane().removeAll();
                        frame.add(productPanel);
                        frame.validate();

                    }
                });


        }
    }

}
