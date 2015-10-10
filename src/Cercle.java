
public class Cercle {
    
    
    private Point centre;
    private Segment rayon;
    private final double PI=3.14;
    
    public Cercle(Segment r){
        this.centre= new Point();
        this.rayon= r;
    }
    
    public Cercle(Point p, Segment r){
        this.centre=p;
        this.rayon=r;
    }
    
    public double perimetre(){
        return( 2*PI*getRayon().distance());
        
    }
    public Cercle symetrie(){
        return new Cercle(centre.symetrie(),rayon.symetrie());
    }

    @Override
    public String toString(){
        return "centre: " + centre+ " et rayon egale à "+ rayon.distance();
        
    }
    /**
     * @return the centre
     */
    public Point getCentre() {
        return centre;
    }

    /**
     * @param centre the centre to set
     */
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    /**
     * @return the rayon
     */
    public Segment getRayon() {
        return rayon;
    }

    /**
     * @param rayon the rayon to set
     */
    public void setRayon(Segment rayon) {
        this.rayon = rayon;
    }
    
    
}
