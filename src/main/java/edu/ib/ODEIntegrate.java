package edu.ib;

import com.sun.jdi.event.StepEvent;

public class ODEIntegrate {
    double tLeft;
    double tRight;
    double x0;
    ODEEquation equation;
    StepHandler stepHandler;


    public ODEIntegrate(double tLeft, double tRight, double x0, ODEEquation equation, StepHandler stepHandler) {
        this.tLeft = tLeft;
        this.tRight = tRight;
        this.equation = equation;
        this.x0 = x0;
        this.stepHandler=stepHandler;
    }

    void integrate( ODEStep method, double h){
        double t = tLeft;
        double x = x0;
        while(t<tRight){
            //System.out.println("Czas: "+ t + "\t X: "+x);
            stepHandler.update(t,x);
            x = method.step(x,t,h,equation);
            t=t+h;
        }
        stepHandler.update(t,x);
       // System.out.println("Czas: "+ t + "\t X: "+x);
    }
}
