package com.campusdual.classroom;

public class Exercise13 {
    public static void main(String[] args) {
        FuelTank ft = new FuelTank();
        ft.showDetails();
        System.out.println("Actualización capacidad");
        ft.setActualFuel(30);
        System.out.println(ft.getActualFuel());
        ft.showDetails();
    }
}