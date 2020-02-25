/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidevclient.services;

import java.sql.ResultSet;
import java.util.List;
import javafx.collections.ObservableList;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import pidevclient.entity.Reclamation;
import pidevclient.entity.Utilisateur;

/**
 *
 * @author PC
 */
public interface IReclamationService {
    public void ajouterReclamation(Reclamation p);  
    public void modifierReclamation(Reclamation p);
    public ObservableList<Reclamation> getAllReclamation();
    
        public ObservableList<Reclamation> getAllSansJoinReclamation();

    public void  traiterReclamation(Reclamation p);
    
    public int getNbrReclamation();
    
   
 
    
    
    
}
