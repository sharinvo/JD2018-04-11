package by.it.akhmelev.jd01_08;

import java.util.Arrays;

class Vector extends Var {

    private double[] value;

    Vector(Vector otherVector) {
        this.value = Arrays.copyOf(otherVector.value,
                otherVector.value.length
        );
    }

    Vector(double[] value) {
        this.value = value;
    }

    Vector(String strVector) {
        String[] strValues = strVector
                .replaceAll("\\{|}", "")
                .trim()
                .split(",\\s*");
        value = new double[strValues.length];
        for (int i = 0; i < value.length; i++) {
            value[i] = Double.parseDouble(strValues[i]);
        }
    }


    @Override
    public Var add(Var other) {
        if (other instanceof Scalar){
            double[] vector=Arrays.copyOf(this.value,this.value.length);
            double scalar=((Scalar)other).getValue();
            for (int i = 0; i < vector.length; i++) {
                vector[i]+=scalar;
            }
            return new Vector(vector);
        }
        else if (other instanceof Vector) {
            double[] vector=Arrays.copyOf(this.value,this.value.length);
            for (int i = 0; i < vector.length; i++) {
                vector[i]+=((Vector)other).value[i];
            }
            return new Vector(vector);
        }
        else
            return super.add(other);
    }

    @Override
    public Var sub(Var other) {
        return super.sub(other);
    }

    @Override
    public Var mul(Var other) {
        return super.mul(other);
    }

    @Override
    public Var div(Var other) {
        return super.div(other);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        String delimiter = "";
        for (double element : value) {
            sb.append(delimiter).append(element);
            delimiter = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
