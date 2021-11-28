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
            if (checkOpportunity) {
                pRect = (aRect + bRect + cRect) / 2.0;
                rectangleSquare = Math.sqrt(pRect * (pRect - aRect) * (pRect - bRect) * (pRect - cRect));
            } else {
                rectangleSquare = 0;
            }
            return rectangleSquare;
    }

    public double roundSquare () {
        roundSquare = Math.PI*Math.pow(rSq,2);
        return roundSquare;
    }

    public double roundVol () {
        roundVol = (4.0/3.0)*Math.PI*Math.pow(rSq,3);
        return roundVol;
    }

    public boolean checkOpportunity () {
        if (((aRect+bRect)>cRect)&&((aRect+cRect)>bRect)&&((bRect+cRect)>aRect)){
            checkOpportunity  = true;
        }
        return checkOpportunity;
    }

}
