package org.example.Data;

public class ComplexNumber {

    int real;
    int imaginary;

    ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    public ComplexNumber(int realPart, int imaginaryPart) {
        this.real = realPart;
        this.imaginary = imaginaryPart;
    }


    public ComplexNumber add(ComplexNumber c2) {
        return new ComplexNumber(this.real + c2.real, this.imaginary + c2.imaginary);
    }


    public ComplexNumber substract(ComplexNumber c2) {
        return new ComplexNumber(this.real - c2.real, this.imaginary - c2.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber c2) {
        ComplexNumber c3 = new ComplexNumber();
        c3.real = this.real * c2.real - this.imaginary * c2.imaginary;
        c3.imaginary = this.real * c2.imaginary + this.imaginary * c2.real;
        return c3;
    }

    public ComplexNumber divide(ComplexNumber c2) {
        ComplexNumber c3 = new ComplexNumber();
        c3.real = (this.real * c2.real + this.imaginary * c2.imaginary) / (c2.real * c2.real + c2.imaginary * c2.imaginary);
        c3.imaginary = (this.imaginary * c2.real - this.real * c2.imaginary) / (c2.real * c2.real + c2.imaginary * c2.imaginary);
        return c3;
    }

    @Override
    public String toString() {
        return this.real + " + " + this.imaginary + "i";
    }
}
