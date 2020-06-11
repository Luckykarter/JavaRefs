public class Main {
    public static void main(String[] args){
        Triangle a = new Triangle(15,
                8, 15, 8, 8);
        Triangle b = new Triangle(3, 2.598,
                3, 3, 3);

        System.out.println(a.findArea());
        System.out.println(b.findArea());

        System.out.println(Triangle.sides);


        Student st1 = new Student("Egor", "Wexler", 2014, 4.7, "Master");
        Student st2 = new Student("Katya", "Wexler", 2009, 5.0, "Master");

        st1.addYear();
        System.out.println(st1.expectedYear);

    }

}
