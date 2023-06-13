package controllers;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import views.SystemView;

public class SettingsController implements MouseListener {

    private SystemView views;//Instanciamos la vista

    public SettingsController(SystemView views) {
        this.views = views;
        this.views.jblProductos.addMouseListener(this);
        this.views.jblCompras.addMouseListener(this);
        this.views.jblClientes.addMouseListener(this);
        this.views.jblEmpleados.addMouseListener(this);
        this.views.jblProveedores.addMouseListener(this);
        this.views.jblCategorias.addMouseListener(this);
        this.views.jblReport.addMouseListener(this);
        this.views.jblAjustes.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()== views.jblProductos){
            views.jplProductos.setBackground(new Color(18, 40, 39));
        }else if(e.getSource()==views.jblCompras){
            views.jplCompras.setBackground(new Color(18, 40, 39));
            
        }else if(e.getSource()==views.jblClientes){
            views.jplClientes.setBackground(new Color(18, 40, 39));
        }else if(e.getSource()== views.jblEmpleados){
            views.jplEmpleados.setBackground(new Color(18, 40, 39));    
        }else if(e.getSource()== views.jblProveedores){
            views.jplProveedores.setBackground(new Color(18, 40, 39));
        }else if(e.getSource()== views.jblCategorias){
            views.jplCategorias.setBackground(new Color(18, 40, 39));
        }else if(e.getSource()== views.jblReport){
            views.jplReport.setBackground(new Color(18, 40, 39));
        }else if(e.getSource()== views.jblAjustes){
            views.jplAjustes.setBackground(new Color(18, 40, 39));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()== views.jblProductos){
            views.jplProductos.setBackground(new Color(18,45,61));
        }else if(e.getSource()==views.jblCompras){
            views.jplCompras.setBackground(new Color(18,45,61));
            
        }else if(e.getSource()==views.jblClientes){
            views.jplClientes.setBackground(new Color(18,45,61));
        }else if(e.getSource()== views.jblEmpleados){
            views.jplEmpleados.setBackground(new Color(18,45,61));    
        }else if(e.getSource()== views.jblProveedores){
            views.jplProveedores.setBackground(new Color(18,45,61));
        }else if(e.getSource()== views.jblCategorias){
            views.jplCategorias.setBackground(new Color(18,45,61));
        }else if(e.getSource()== views.jblReport){
            views.jplReport.setBackground(new Color(18,45,61));
        }else if(e.getSource()== views.jblAjustes){
            views.jplAjustes.setBackground(new Color(18,45,61));
        }
    }
    }


