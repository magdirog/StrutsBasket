/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/* import for parsing the xml file */
import java.io.File;
import org.w3c.dom.Document;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException; 


/**
 *
 * @author magda
 */
public class BasketForm extends org.apache.struts.action.ActionForm 
implements java.io.Serializable {
    
    //Synartisi opou ginetai to parsing tou xml arxeiou
        public double[] parsing()
        { 
                 String ccc;
                 String sss;
                 String www;
                 double ccafe;
                 double ssugar;
                 double wwater;
                 double[] p=new double[3];
            
            try{
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                Document doc = db.parse("http://texwww.inf.uth.gr:8080/~magdirog/parser.xml");
                
                doc.getDocumentElement().normalize ();

                NodeList n1 = doc.getElementsByTagName("cafe");
                NodeList n2 = doc.getElementsByTagName("sugar");
                NodeList n3 = doc.getElementsByTagName("water");

                Node caf=n1.item(0);
                Node sug=n2.item(0);
                Node wat=n3.item(0);
                
                ccc=caf.getFirstChild().getNodeValue();
                sss=sug.getFirstChild().getNodeValue();
                www=wat.getFirstChild().getNodeValue();

                ccafe=Double.parseDouble(ccc);
                ssugar=Double.parseDouble(sss);
                wwater=Double.parseDouble(www);
                
                p[0]=ccafe;
                p[1]=ssugar;
                p[2]=wwater;
                }
                catch (SAXParseException err){
                }
                catch (SAXException e){
                }
                catch (Throwable t){
                }
                return p;
     }
    
    private double cafe;
    private double sugar;
    private double water;
    
    private double totalCafe;
    private double totalSugar;
    private double totalWater;
    
    private double total;
    
     public void setCafe(double cafe) {
        this.cafe = cafe;
    }
    public double getCafe() {
        return cafe;
    }
    
    
    public void setSugar(double sugar) {
        this.sugar = sugar;
    }
    public double getSugar() {
        return sugar;
    }

    
    public void setWater(double water) {
        this.water = water;
    }
    public double getWater() {
        return water;
    }
    
    public void setTotalCafe(double totalCafe) {
        double pinakas[]=parsing();
        this.totalCafe = totalCafe*pinakas[0];
    }
    public double getTotalCafe() {
        return totalCafe;
    }
    
    

    public void setTotalSugar(double totalSugar) {
        double pinakas[]=parsing();
        this.totalSugar = totalSugar*pinakas[1];
    }
    public double getTotalSugar() {
        return totalSugar;
    }

    public void setTotalWater(double totalWater) {
        double pinakas[]=parsing();
        this.totalWater = totalWater*pinakas[2];
    }
    
    public double getTotalWater() {
        return totalWater;
    }
    

    public void setTotal(double tCafe,double tSugar,double tWater) {
        tCafe=getTotalCafe();
        tSugar=getTotalSugar();
        tWater=getTotalWater();
        this.total = tCafe+ tSugar+ tWater;
    }
    
    public double getTotal() {
        return total;
    }
   
    public BasketForm() {
        super();
        // TODO Auto-generated constructor stub
    }
}
