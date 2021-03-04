package main.java.polymorphism;

public class Main_degree {
    public static void main(String[] args) {
        Degree d=new Degree();
        d.getDegree();

        Degree ug=new Undergraduate();
        ug.getDegree();

        Degree pg=new Postgraduate();
        pg.getDegree();

    }
}
