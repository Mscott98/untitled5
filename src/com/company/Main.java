package com.company;

public class Main {

    public static void main(String[] args) {
	triangle1();
    System.out.println("Area = ½b × h\n" +
            "= ½ × 1 × 1\n" +
            "= 0.5");

	rectangle2();
    System.out.println("area = w × h\n" +
            "= 1 × 1\n" +
            "= 1");
	circle3();
    System.out.println("Area = π × r²\n" +
            "= π × 1²\n" +
            "= 3.141592654")
	sector4();
    System.out.println("Area = ½r²θ\n" +
            "= ½ × 1² × 1\n" +
            "= 0.5");

    }

    Scanner myObj = new Scanner(System.in);
        System.out.println("1. Triangle area" +
                "2. Rectangle Area" +
                "3. circle area" +
                "4. Sector area")
    String area = myObj.nextLine();

        Private static void triangle1()
}

}
