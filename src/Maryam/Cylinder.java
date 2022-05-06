package Maryam;

//Override the area() and I need to call the parent class constructor
//Cube & Cylinder class is the similar way to square & circle class
//Cylinder is three-dimensional geometrical figure/container withStraight parallel sides and two circular cross-sections.
//Surface Area of Cylinder = 2 Π  (r + h)

import java.awt.*;

public class Cylinder<pi> extends Shape implements Volume{

    private float r,h, surfacearea; // This private variable name is not final means I can generate getter&setter

    //StaticVariable that is final I can set them directly pi = 3.14; or I can use static block
    public final static double  pi  = 3.14;

    // I need to generate the constructor to call the parent class constructor.
    //Once you apply if U get additional argument such as String name inside my constructor()
    //OnceGenerate constructor IGet superKeyword byDefault & is callTheParentClass constructor

   public Cylinder( float r, float h, float surfacearea) { //Here, r is the radius and h is the height of the cylinder.
    super( "Cylinder"); //Here I can give the name Cylinder to set parent class, so the name will be set
    setSurfacearea(surfacearea);//thisKeywordOnlyAssignArgument toTheInstance,Use setter coz Check IfIsValidArgumen

    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public float getSurfacearea() {
        return surfacearea;
    }

    public void setSurfacearea(float surfacearea) {
        this.surfacearea = (2*22*(r + h))/7; //calculation
    }

    @Override
    public double area() {  //WhatEver the implementation u wantToGive toCalculate theAreaYou can give here
        return r * h * pi;
    }

    @Override
    public double perimeter() { //WhatEver theImplementation you want to give u can give here-->return 2 * radius * pi;
        return 2.0 * 5.0 * pi;
    }

    @Override
    public double volume() { //Return typeCouldBe,void or double nao importa.Mais Access modifierCanNotMakePrivate
        return ((22*r*r*h)/7); // find volume of cylinder
    }

    public String toString() {
        return "Cylinder{" +
                "r=" + r +
                ", h=" + h +
                super.toString()+ //use super keyword to call toString() from parent class
                ", surfacearea=" + surfacearea +
                ", volume =" + volume() +
                '}';
    }
}
