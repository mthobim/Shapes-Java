/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

import static java.lang.Math.PI;

/**
 *
 * @author mthob
 */
public class Calculator {
private int num1, num2, sum, different, remainder;
  private double radius, area,quotiant, product;
    private double areaOfCircle;
    /**
     * @return the num1
     */
    public int getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public int getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    /**
     * @return the sum
     */
    public int getSum() {
        return sum;
    }

    /**
     * @param sum the sum to set
     */
    public void setSum(int sum) {
        this.sum = sum;
    }

    /**
     * @return the different
     */
    public int getDifferent() {
        return different;
    }

    /**
     * @param different the different to set
     */
    public void setDifferent(int different) {
        this.different = different;
    }

    /**
     * @return the remainder
     */
    public int getRemainder() {
        return remainder;
    }

    /**
     * @param remainder the remainder to set
     */
    public void setRemainder(int remainder) {
        this.remainder = remainder;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * @return the quotiant
     */
    public double getQuotiant() {
        return quotiant;
    }

    /**
     * @param quotiant the quotiant to set
     */
    public void setQuotiant(double quotiant) {
        this.quotiant = quotiant;
    }

    /**
     * @return the product
     */
    public double getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(double product) {
        this.product = product;
    }
  private double calculate(double radius){
      areaOfCircle = Math.PI*Math.pow(radius,2);
      return areaOfCircle;
  }
  
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        
        System.out.println(cal.calculate(10.0));
    }
}
