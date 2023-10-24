public class Gecko {
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

    public Gecko(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Hello " + name + "!");
    }

    public Gecko(String name) {
        this.name = name;
        System.out.println("Hello " + name + "!");
    }

    public Gecko() {
        this.name = "Unknown";
        System.out.println("Hello!");
    }


    public void status() {
        switch (this.age) {
            case 0:
                System.out.println("Unborn Gecko");
                break;
            case 1:
            case 2:
                System.out.println("Baby Gecko");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Adult Gecko");
                break;
            case 11:
            case 12:
            case 13:
                System.out.println("Old Gecko");
                break;
            default:
                System.out.println("Impossible Gecko");
                break;
        }
    }

    public void hello(String name) {
        System.out.println("Hello " + name + ", I'm " + this.name + "!");
    }

    public void hello(int nb) {
        for (int i = 0; i < nb; i++) {
            System.out.println("Hello, I'm " + this.name + "!");
        }
    }

    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println("Yummy!");
            this.energy += 10;
        } else if (food.equalsIgnoreCase("Vegetable")) {
            System.out.println("Erk!");
            this.energy -= 10;
        } else {
            System.out.println("I can't eat this!");
        }
        if (this.energy > 100) {
            this.energy = 100;
        } else if (this.energy < 0) {
            this.energy = 0;
        }
    }

    public void work() {
        if (this.energy >= 25) {
            System.out.println("I'm working T.T");
            this.energy -= 9;
        } else {
            System.out.println("Heyyy... I'm too sleepy, better take a nap!");
            this.energy += 50;
        }
    }

    public void fraternize(Gecko other) {
        if (this.energy >= 30 && other.energy >= 30) {
            System.out.println("I'm going to drink with " + other.name + "!");
            this.energy -= 30;
            other.energy -= 30;
        } else if (this.energy < 30 && other.energy < 30) {
            System.out.println("Not today!");
        } else if (this.energy < 30) {
            System.out.println("Sorry " + other.name + ", I'm too tired to go out tonight.");
            System.out.println("Oh! That's too bad, another time then!");
        } else if (other.energy < 30) {
            System.out.println("Sorry " + this.name + ", I'm too tired to go out tonight.");
            System.out.println("Oh! That's too bad, another time then!");
        }
    }

    public void fraternize(Snake other) {
        if (this.energy >= 10) {
            System.out.println("LET'S RUN AWAY!!!");
            this.energy = 0;
        } else {
            System.out.println("...");
        }
    }


    private int energy = 100;

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

