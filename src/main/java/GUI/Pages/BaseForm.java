package GUI.Pages;

import Common.Header;
import Service.Service;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
/*

*/
public  class BaseForm <T> {
    private JTable tb;
    private JPanel main;
    DefaultTableModel tbModel;
    private final Class<T> type;
    private Service service;
    public BaseForm(Class<T> type, Service service){
        this.type = type;
        this.service = service;
    }
    public JPanel getMain() {
        setHeader();
        setData();
        return main;
    }
    public void setHeader(){
        tbModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };
        String headers = Header.getHeader(type.getSimpleName());
        tbModel.setColumnIdentifiers(headers.split("#"));
        tb.setRowHeight(50);
        tb.setModel(tbModel);
    }
    public void setData(){
        List<T> list = service.getData();
        list.forEach((e)->{
            tbModel.addRow(e.toString().split("#"));
        });
    }
    public void setMain(JPanel main) {
        this.main = main;
    }

    public JTable getTb() {
        return tb;
    }

    public void setTb(JTable tb) {
        this.tb = tb;
    }
}
