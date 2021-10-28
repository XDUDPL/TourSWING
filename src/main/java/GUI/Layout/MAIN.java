package GUI.Layout;

import GUI.Pages.BaseForm;
import Model.KhachHangModel;
import Model.TourLoaiModel;
import Model.TourModel;
import Service.KhachHangService;
import Service.LoaiTourService;
import Service.*;

import javax.swing.*;
import java.awt.*;

public class MAIN extends JFrame{
    private JPanel main;
    private JPanel Menutop;
    private JPanel SideMenu;
    private JPanel Content;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton Tour;
    private JButton LoaiTour;

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
        LoaiTour.addActionListener((e)->{
            Content.removeAll();
            Content.add(new BaseForm<TourLoaiModel>(TourLoaiModel.class, new LoaiTourService()).getMain(), BorderLayout.CENTER);
            revalidate();
            repaint();
        });
        Tour.addActionListener((e)->{
            Content.removeAll();
            Content.add(new BaseForm<TourModel>(TourModel.class, new TourService()).getMain(),BorderLayout.CENTER);
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
