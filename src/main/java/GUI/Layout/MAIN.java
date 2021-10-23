package GUI.Layout;

import GUI.Pages.BaseForm;
import GUI.Pages.Hello;
import GUI.Pages.Main1;
import Model.KhachHangModel;
import Model.TourLoaiModel;
import Service.KhachHangService;
import Service.LoaiTourService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MAIN extends JFrame{
    private JPanel main;
    private JPanel Menutop;
    private JPanel SideMenu;
    private JPanel Content;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton loaiTourButton;

    public MAIN(){
        //Side Menu
            //Button
        //Menutop
        //Content
        button3.addActionListener((e)->{
            Content.removeAll();
            Content.add(new BaseForm<KhachHangModel>(KhachHangModel.class,new KhachHangService()).getMain(), BorderLayout.CENTER);
            revalidate();
            repaint();
        });
        loaiTourButton.addActionListener((e)->{
            Content.removeAll();
            Content.add(new BaseForm<TourLoaiModel>(TourLoaiModel.class, new LoaiTourService()).getMain(), BorderLayout.CENTER);
            revalidate();
            repaint();
        });
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(main);
    }
    public static void main(String[] args) {
        MAIN a = new MAIN();
        a.pack();
        a.setVisible(true);
    }
}
