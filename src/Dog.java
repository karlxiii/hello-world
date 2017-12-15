public class Dog {

    private String name;
    private int age;
    private int humanAge;

    public Dog(String d, int d1, int d2){
        this.name = d;
        this.age = d1;
        this.humanAge = d2;
    }

    public int humanAgeCalc(int a){
        int age2 = age*4;
        return age2;
    }

    public String toString(){
        return "Voff! Voff!";
    }
}
