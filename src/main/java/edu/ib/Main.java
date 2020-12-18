package edu.ib;

public class Main {
    public static void main(String[] args) {

        ConsoleHandler consoleHandler=new ConsoleHandler();
        ODEEquation equation = (x,t) -> -2*Math.pow(t,3)+12*Math.pow(t,2)-20*t+8.5;
        ODEIntegrate integrate1 = new ODEIntegrate(0,4,1,equation,consoleHandler);
        integrate1.integrate(new Euler(),0.5);
        consoleHandler.print();
    }

}
