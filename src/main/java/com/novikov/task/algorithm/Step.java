package com.novikov.task.algorithm;

public class Step
{
    private int I;
    private int J;

    public Step(int i, int j)
    {
        I = i;
        J = j;
    }

    public int getI()
    {
        return I;
    }

    public int getJ()
    {
        return J;
    }

    public void setI(int i) {
        I = i;
    }

    public void setJ(int j) {
        J = j;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + I;
        result = prime * result + J;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Step other = (Step) obj;
        if (I != other.getI())
            return false;
        if (J != other.getJ())
            return false;
        return true;
    }
}
