/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.bai2;

/**
 *
 * @author LENOVO LEGION
 */
public class Main {
    public static void main(String[] args) {
        // Tạo mảng chứa các hình
        Shape[] shapes = {
            new Circle(5),
            new Square(4),
            new Triangle(3, 6),
            new Sphere(3),
            new Cube(2),
            new Tetrahedron(4)
        };

        // Duyệt qua mảng và hiển thị thông tin
        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName());
            System.out.println("Area: " + shape.getArea());

            if (shape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape threeDShape = (ThreeDimensionalShape) shape;
                System.out.println("Volume: " + threeDShape.getVolume());
            }

            System.out.println();
        }
    }
}
