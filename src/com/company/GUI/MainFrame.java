package com.company.GUI;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class MainFrame extends JFrame implements MainFrameShop {

    public StartPanel startPanel;

    public MainFrame(){

        super("Sklep");
        new File("C:\\Pigi\\ProjektTO\\untitled1\\src\\com\\company\\DAO\\Db_sklep.yap").delete();
        ObjectContainer db = Db4o.openFile( Db4o.newConfiguration(), "C:\\Pigi\\ProjektTO\\untitled1\\src\\com\\company\\DAO\\Db_sklep.yap");
        startPanel = new StartPanel(this, db,0, null);
        add(startPanel);

        setPreferredSize(new Dimension(750, 770));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }

}
