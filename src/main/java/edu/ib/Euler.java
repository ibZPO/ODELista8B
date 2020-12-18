package edu.ib;

public class Euler implements ODEStep{
    @Override
    public double step(double x, double t, double h, ODEEquation ode) {
        return x + (ode.f(x, t) * h);
    }
}
