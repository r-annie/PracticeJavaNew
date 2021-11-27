public class GeometryCalculator {

    private double roundSquare;
    private double rectangleSquare;
    private double roundVol;
    private boolean checkOpportunity = false;
    private double aRect;
    private double bRect;
    private double cRect;
    private double rSq;
    private double pRect;

    public GeometryCalculator(double aRect, double bRect, double cRect) {
        this.aRect = aRect;
        this.bRect = bRect;
        this.cRect = cRect;
    }

    public GeometryCalculator(double rSq) {
        this.rSq = rSq;
    }

    public double rectangleSquare () { //проверка условия построения должна быть
            pRect = (aRect + bRect + cRect) / 2.0;
            this.rectangleSquare = Math.sqrt(pRect * (pRect - aRect) * (pRect - bRect) * (pRect - cRect));
            return this.rectangleSquare;
    }

    public double roundSquare () {
        this.roundSquare = Math.PI*Math.pow(rSq,2);
        return this.roundSquare;
    }

    public double roundVol () {
        this.roundVol = (4.0/3.0)*Math.PI*Math.pow(rSq,3);
        return this.roundVol;
    }

    public boolean checkOpportunity () {
        if (((aRect+bRect)>cRect)&&((aRect+cRect)>bRect)&&((bRect+cRect)>aRect)){
            this.checkOpportunity  = true;
            return this.checkOpportunity;
        }
        return this.checkOpportunity;
    }

}
