public class Snake {
        /*
    Let’s implement a new fraternize method that takes one parameter.
If the parameter is a Gecko Object, our Gecko will be happy and go drink with his friend.
It will cost both of them 30 Energy.
They will both say (starting with the current Gecko) I'm going to drink with <otherName>!
If one of them doesn’t have enough energy:
3 it must display Sorry <otherName>, I'm too tired to go out tonight. ;
3 the other will then display Oh! That's too bad, another time then!.
If both of them are too tired to go out, they will both display Not today!.
If the parameter is a Snake and if Gecko’s energy is:
3 greater than or equal to 10, the Gecko displays LET'S RUN AWAY!!! and it’s energy is set to 0.
3 less than 10, the the Gecko plays dead and displays ...
Feel free to add any method that you reckon necessary.
     */
    private String name;
    private int age;

    public Snake(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Hello " + name + "!");
    }

    public Snake(String name) {
        this.name = name;
        System.out.println("Hello " + name + "!");
    }

    public Snake() {
        this.name = "Unknown";
        System.out.println("Hello!");
    }
}
