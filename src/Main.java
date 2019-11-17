public class Main {

    public static void main(String[] args) {

        Father father = new Father(25, "John", Profession.PROGRAMMER);
        System.out.println(father.getInfo());
        father.hobby("Reading");
        father.favoriteOccupation("Swimming");
        System.out.println("________________________");

        Mother mother = new Mother(21, "Ameli", Profession.TEACHER, "Italian");
        System.out.println(mother.getInfo());
        mother.hobby("Writing");
    }
}
