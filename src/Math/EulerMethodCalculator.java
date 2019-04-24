package Math;

public class EulerMethodCalculator {

    double stepSize;
    double initialX;
    double initialY;
    double x_n = -1;    //init val
    double y_n = -1;    //init val
    double y_nPlusOne = -1;    //init val

    public EulerMethodCalculator(){
        //empty constructor
    }

    public EulerMethodCalculator(double stepSize, double initialX, double initialY){
        this.stepSize = stepSize;
        this.initialX = initialX;
        this.initialY = initialY;
        this.x_n = initialX;
        this.y_n = initialY;
    }

    public double func(double x, double y){
        return Math.sqrt(4 * x + 9 * y * y);   //RHS of original differential equation
    }

    public double calculatey_nPlusOne(){
        double result = this.y_n + this.stepSize * func(this.x_n, this.y_n);
        this.y_nPlusOne = result;
        return result;
    }

    public void nextRound(){
        calculatey_nPlusOne();
        prettyPrint();
        this.x_n += this.stepSize;
        this.y_n = this.y_nPlusOne;
    }

    public void prettyPrint(){
        System.out.println();   //new line separator
        System.out.println("x_n: " + Double.toString(this.x_n));
        System.out.println("y_n: " + Double.toString(this.y_n));
    }

    public static void main(String[] args){
        EulerMethodCalculator testObj = new EulerMethodCalculator(0.2, 0.0, 2.0);
        for(int i = 0; i < 8; ++ i){
            testObj.nextRound();
        }
    }
}
