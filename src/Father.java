public class Father extends Man {
    private String name;
    private Profession profession;

    public Father(int age, String name, Profession profession) {
        super(age);
        this.name = name;
        this.profession = profession;
    }

    public final void favoriteOccupation(String string){
        System.out.println(string);
    }

    public void hobby(String string){
        System.out.println(string);
    }

    public String getInfo(){
        return getAge() + " " + getName() + " " + getProfession();
    }

    public String getName() {
        return name;
    }

    public Profession getProfession() {
        return profession;
    }
}
