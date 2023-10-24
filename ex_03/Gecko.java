public class Gecko {
    private String name;

    public Gecko(String name) {
this.name = name;
        System.out.println("Hello " + name + "!");
    }

    public Gecko() {
this.name = "Unknown";
        System.out.println("Hello!");
    }

    public String getName() {
        return this.name;
    }
}

/*
public class Example {
    public static void main(String[] args) {
        Gecko arthur = new Gecko(" Arthur ");
        Gecko benjy = new Gecko();
        System.out.println(arthur.getName());
        System.out.println(benjy.getName());
    }
}
 */