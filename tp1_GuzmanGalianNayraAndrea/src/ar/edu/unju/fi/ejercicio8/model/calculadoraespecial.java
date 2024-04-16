package ar.edu.unju.fi.ejercicio8.model;

public class calculadoraespecial {
	private int n;

    public calculadoraespecial() {
    }

    public double calcularsumatoria() {
        double sumatoria = 0;
        for (int k = 1; k <= n; k++) {
        	sumatoria += Math.pow((k * (k + 1) / 2.0), 2);
        }
        return sumatoria;
    }

    public double calcularproductoria() {
        double productoria = 1;
        for (int k = 1; k <= n; k++) {
            productoria *= (k * (k + 4));
        }
        return productoria;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
