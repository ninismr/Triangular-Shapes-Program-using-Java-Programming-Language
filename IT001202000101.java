import java.util.Scanner;

public class IT001202000101 {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);
        int TriangleShapesSelected;

        System.out.println("Choose the shape that you want to calculate: ");
        System.out.println("1 - Equilateral Triangle\n2 - Isosceles Triangle\n3 - Right-Angled Triangle\n4 - Pyramid\n5 - Tetrahedron\n6 - Triangular Prism");
        TriangleShapesSelected = input.nextInt();

        if(TriangleShapesSelected == 1){
            EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
            System.out.print("\nPlease enter the side length of the equilateral triangle: ");
            float s = input.nextFloat();
            equilateralTriangle.setSide(s);
            System.out.print("\nThe perimeter of the equilateral triangle: " + equilateralTriangle.getPerimeter() + " cm");
            System.out.print("\nThe area of the equilateral triangle: " + equilateralTriangle.getArea() + " cm^2");
        }

            else if(TriangleShapesSelected == 2){
                IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
                System.out.print("\nPlease enter the base length of the isosceles triangle: ");
                float b = input.nextFloat();
                isoscelesTriangle.setBase(b);
                System.out.print("Please enter the side length of the isosceles triangle: ");
                float s = input.nextFloat();
                isoscelesTriangle.setSide(s);
                isoscelesTriangle.getHeight();
                System.out.print("\nThe perimeter of the isosceles triangle: " + isoscelesTriangle.getPerimeter() + " cm");
                System.out.print("\nThe area of the isosceles triangle: " + isoscelesTriangle.getArea() + " cm^2");
            }
            
            else if(TriangleShapesSelected == 3){
                RightAngledTriangle rightAngledTriangle = new RightAngledTriangle();
                System.out.print("\nPlease enter the base length of the right-angled triangle: ");
                float b = input.nextFloat();
                rightAngledTriangle.setBase(b);
                System.out.print("Please enter the height of the right-angled triangle: ");
                float h = input.nextFloat();
                rightAngledTriangle.setHeight(h);
                System.out.print("\nThe perimeter of the right-angled triangle: " + rightAngledTriangle.getPerimeter() + " cm");
                System.out.print("\nThe area of the right-angled triangle: " + rightAngledTriangle.getArea() + " cm^2");
            }

            else if(TriangleShapesSelected == 4){
                Pyramid pyramid = new Pyramid();
                System.out.print("\nPlease enter the base side length of the pyramid: ");
                float bs = input.nextFloat();
                pyramid.setBaseSide(bs);
                System.out.print("Please enter the height of the pyramid: ");
                float ph = input.nextFloat();
                pyramid.setPyramidHeight(ph);
                System.out.print("\nThe surface area of the pyramid: " + pyramid.getArea() + " cm^2");
                System.out.print("\nThe volume of the pyramid: " + pyramid.getVolume() + " cm^3");
            }

            else if(TriangleShapesSelected == 5){
                Tetrahedron tetrahedron = new Tetrahedron();
                System.out.print("\nPlease enter the edge length of the tetrahedron: ");
                float s = input.nextFloat();
                tetrahedron.setSide(s);
                System.out.print("\nThe surface area of the tetrahedron: " + tetrahedron.getArea() + " cm^2");
                System.out.print("\nThe volume of the tetrahedron: " + tetrahedron.getVolume() + " cm^3");
            }

            else if(TriangleShapesSelected == 6){
                TriangularPrism triangularPrism = new TriangularPrism();
                System.out.print("\nPlease enter the base side length of the triangular prism: ");
                float b = input.nextFloat();
                triangularPrism.setBase(b);
                System.out.print("Please enter the base height of the triangular prism: ");
                float h = input.nextFloat();
                triangularPrism.setHeight(h);
                System.out.print("Please enter the height of the triangular prism: ");
                float ph = input.nextFloat();
                triangularPrism.setPrismHeight(ph);
                System.out.print("\nThe surface area of the triangular prism: " + triangularPrism.getArea() + " cm^2");
                System.out.print("\nThe volume of the triangular prism: " + triangularPrism.getVolume()  + " cm^3");
            }

        input.close();
    }        
}