public final class Mother extends Father {
    private String nation;

    public Mother(int age, String name, Profession profession, String nation) {
        super(age, name, profession);
        this.nation = nation;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " " + getNation();
    }

    @Override
    public void hobby (String string) {
        super.hobby(string);
    }

    public String getNation() {
        return nation;
    }
}
