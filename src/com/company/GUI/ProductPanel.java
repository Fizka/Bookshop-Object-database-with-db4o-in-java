package com.company.GUI;

import com.company.DAO.Controller;
import com.company.Model.Produkt;
import com.db4o.ObjectContainer;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.String;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

import java.util.List;

public class ProductPanel extends JPanel implements MainFrameShop {

    private final JFrame frame;
    private JButton backButton;
    private JButton addButton;
    private Controller dbf;
    private JScrollPane scrollBarInventoryList;
    int intQuantity;

    private JPanel mainPanel;
    private JPanel itemsPanel;
    private JPanel productPanel;
    private JPanel buttonPanel;

    private JLabel labelProductName;
    private JLabel labelProducentName;
    private JLabel labelScription;
    private LogoPanel logoPanel;
    ObjectContainer db;
    public List<Produkt> pro;

    public ProductPanel( JFrame frame, ObjectContainer db, int intQuantity, List<Produkt> pro )
    {
        this.intQuantity = intQuantity;
        this.frame = frame;
        this.db = db;
        this.pro = pro;
        CreatePanels();
    }

    private void CreatePanels(){

         System.out.println(intQuantity);

        mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(frameSize));
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.LIGHT_GRAY);

        logoPanel = new LogoPanel();
        logoPanel.setPreferredSize(new Dimension(700, 200));

        itemsPanel = new JPanel();
        //itemsPanel.setPreferredSize(new Dimension(700, 1200));
        itemsPanel.setMaximumSize(new Dimension(700, 2000));
        itemsPanel.setMinimumSize(new Dimension(700,420));
        itemsPanel.setBackground(Color.LIGHT_GRAY);
        itemsPanel.setLayout(new GridLayout(intQuantity, 1, 10, 10));
        itemsPanel.setBorder(new EmptyBorder(10, 20, 10, 20));

        for(int i =0; i<intQuantity; i++)
        {
            String StringProductName[] = new String[intQuantity];
            String StringProducentName[] = new String[intQuantity];
            String StringScription[]  = new String[intQuantity];

            productPanel = new JPanel();
            productPanel.setLayout(new GridLayout(3, 2,10, 10));
            productPanel.setBorder(new EmptyBorder(5,5,5,5));
            productPanel.setPreferredSize(new Dimension(650, 75));
            productPanel.setMaximumSize(new Dimension(650,75));

            //System.out.println(pro.get(i).getNazwa_produktu());
            StringProductName[i] = pro.get(i).getNazwa_produktu() ;
            StringProducentName[i] = pro.get(i).getKategoria();
            StringScription[i] = pro.get(i).getNazwa_producenta();

            labelProductName = new JLabel(StringProductName[i]);
            labelProductName.setFont(myFonttwo);
            labelProductName.setHorizontalAlignment(SwingConstants.CENTER);
            labelProductName.setVerticalAlignment(SwingConstants.CENTER);
            labelProductName.setForeground(Color.black);

            labelProducentName = new JLabel(StringProducentName[i]);
            labelProducentName.setFont(myFonttwo);
            labelProducentName.setHorizontalAlignment(SwingConstants.CENTER);
            labelProducentName.setVerticalAlignment(SwingConstants.CENTER);
            labelProducentName.setForeground(Color.black);

            labelScription = new JLabel(StringScription[i]);
            labelScription.setFont(myFonttwo);
            labelScription.setHorizontalAlignment(SwingConstants.CENTER);
            labelScription.setVerticalAlignment(SwingConstants.CENTER);
            labelScription.setForeground(Color.black);

           labelProductName.setText("Nazwa produktu : " + StringProductName[i]);
           labelProducentName.setText("Kategoria :" + StringProducentName[i]);
           labelScription.setText("Nazwa Producenta:" + StringScription[i]);

            productPanel.add(labelProductName);
            productPanel.add(labelProducentName);
            productPanel.add(labelScription);

            itemsPanel.add(productPanel);
        }

        scrollBarInventoryList = new JScrollPane(itemsPanel,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollBarInventoryList.setBounds(0, 0, 700, 400);
        scrollBarInventoryList.setPreferredSize(new Dimension(700, 400));

        backButton = new JButton("Powrót");
        backButton.setMaximumSize(new Dimension(100, 30));
        backButton.setSize(new Dimension(100, 20));
        backButton.setBackground(Color.GRAY);
        backButton.setFont(myFont);
        backButton.setForeground(Color.black);
        backButton.addActionListener(new BackListener());

        addButton = new JButton("Dodaj");
        addButton.setMaximumSize(new Dimension(100, 30));
        addButton.setSize(new Dimension(100, 20));
        addButton.setBackground(Color.GRAY);
        addButton.setFont(myFont);
        addButton.setForeground(Color.black);
        addButton.addActionListener(new AddListener());

        buttonPanel = new JPanel();
        buttonPanel.add(backButton);
        buttonPanel.add(addButton);
        buttonPanel.setLayout(new GridLayout(1, 2,10, 10));

        mainPanel.add(logoPanel, BorderLayout.BEFORE_FIRST_LINE);
        mainPanel.add(scrollBarInventoryList, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.PAGE_END);
        add(mainPanel);
        repaint();

    }


    class BackListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            System.out.println("I am working!");

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    JPanel startPanel= new StartPanel(frame, db, intQuantity, pro);
                    frame.getContentPane().removeAll();
                    frame.add(startPanel);
                    frame.validate();
                }
            });


        }
    }

    class AddListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            System.out.println("I am working!");

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {

                    dbf = new Controller(db);
                    dbf.add(db);
                    //dbf.listResult(db);
                    pro = dbf.listProd(db);
                    intQuantity = pro.size();
                    System.out.println(pro.size());

                    JPanel startPanel= new ProductPanel(frame, db, intQuantity, pro );
                    frame.getContentPane().removeAll();
                    frame.add(startPanel);
                    frame.validate();

                }
            });


        }
    }

}
