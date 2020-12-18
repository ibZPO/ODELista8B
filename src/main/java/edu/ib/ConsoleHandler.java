package edu.ib;

import java.util.ArrayList;

public class ConsoleHandler implements  StepHandler{
    ArrayList<Double> arrayListX;
    ArrayList<Double> arrayListT;

    public ConsoleHandler() {
        arrayListX=new ArrayList<>();
        arrayListT=new ArrayList<>();

    }


    @Override
    public void update(double t, double x) {
        arrayListX.add(x);
        arrayListT.add(t);

    }
    public void print(){
        for(int i=0;i<arrayListT.size();i++){
            System.out.println("Czas: "+arrayListT.get(i)  + "\t X: "+arrayListX.get(i));
        }

    }


}
