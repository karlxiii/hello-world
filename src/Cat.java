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
<<<<<<< HEAD
        return "Mjau..mjau!";
=======
        return "Mjau..mjau";

 
>>>>>>> 02711cb3237aa24401013c4de3ad91d723d74798
    }
}
