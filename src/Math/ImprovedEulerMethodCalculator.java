package Math;

public class ImprovedEulerMethodCalculator {

    double stepSize;
    double initialX;
    double initialY;
    double x_n = -1;    //init val
    double y_n = -1;    //init val
    double k_n1 = -1;   //init val
    double k_n2 = -1;   //init val
    double y_nPlusOne = -1;    //init val

    public ImprovedEulerMethodCalculator(){
        //empty constructor
    }

    public ImprovedEulerMethodCalculator(double stepSize, double initialX, double initialY){
        this.stepSize = stepSize;
        this.initialX = initialX;
        this.initialY = initialY;
        this.x_n = initialX;
        this.y_n = initialY;
    }

    public double func(double x, double y){
        return x + y;   //RHS of original differential equation
    }

    public double calculatek_n1(){
        double result = func(this.x_n, this.y_n);
        this.k_n1 = result;
        return result;
    }

    public double calculatek_n2(){
        double result = func(this.x_n + this.stepSize, this.y_n + this.k_n1 * this.stepSize);
        this.k_n2 = result;
        return result;
    }

    public double calculatey_nPlusOne(){
        double result = this.y_n + 0.5 * this.stepSize * func(this.k_n1, this.k_n2);
        this.y_nPlusOne = result;
        return result;
    }

    public void nextRound(){
        calculatek_n1();
        calculatek_n2();
        calculatey_nPlusOne();
        prettyPrint();
        this.x_n += this.stepSize;
        this.y_n = this.y_nPlusOne;
    }

    public void prettyPrint(){
        System.out.println();   //new line separator
        System.out.println("x_n: " + Double.toString(this.x_n));
        System.out.println("y_n: " + Double.toString(this.y_n));
        System.out.println("k_{n1}: " + Double.toString(this.k_n1));
        System.out.println("k_{n2}: " + Double.toString(this.k_n2));
    }

    public static void main(String[] args){
        ImprovedEulerMethodCalculator testObj = new ImprovedEulerMethodCalculator(0.25, 2.0, 9.0);
        for(int i = 0; i < 5; ++ i){
            testObj.nextRound();
        }
    }
}
