public class Cat {

    private String name;
    private int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String hälsa(){
        return "Hej mitt namn är " + name + "!\n" + toString();
    }


    public String toString(){
        return "Mjau..mjau";
    }
}
