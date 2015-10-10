/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
public class Point {
    
    //les attributs
     private double abscis;
     private double ordonne;
             
    //les constructeurs
             /*par defaut*/
             public Point(){
             this.abscis = 0.0;
             this.ordonne=0.0;
             }
             
            public Point(double x){
                this.abscis =x;
                this.ordonne= x;
            }
            
            public Point( double x , double y){
                this.abscis= x;
                this.ordonne=y;
            }
//les getters & setters
    /**
     * @return the abscis
     */
    public double getAbscis() {
        return abscis;
    }

    /**
     * @param abscis the abscis to set
     */
    public void setAbscis(double abscis) {
        this.abscis = abscis;
    }

    /**
     * @return the ordonne
     */
    public double getOrdonne() {
        return ordonne;
    }

    /**
     * @param ordonne the ordonne to set
     */
    public void setOrdonne(double ordonne) {
        this.ordonne = ordonne;
    }
            
            
     public Point symetrie(){
         Point p= new Point();
        p.abscis=0-abscis;
        p.ordonne=ordonne;
        return p;
         
     }
    
     @Override
     public String toString(){
         return "( "+abscis+ " , "+ ordonne+ " )";
     }
}
