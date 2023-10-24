public class Gecko {
    /*
    Copy your Gecko.java from the previous exercise and add an eat method which:
3 takes a string as parameter ;
3 is case insensitive ;
3 returns nothing.
Depending on the argument (value of the parameter), the Gecko must display:
3 Yummy!, if the argument is equal to Meat ;
3 Erk!, if the argument is equal to Vegetable ;
3 I can't eat this!, otherwise.
As usual, every sentence must be followed by a newline.
Moreover, add an energy attribute to our Gecko:
3 by default it is equal to 100 ;
3 a gecko’s energy should always be between 0 and 100 (included).
Add a setter (setEnergy) and a getter (getEnergy) for this attribute.
Every time our Gecko eats something, it will win or lose some energy. If it eats
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
        } else if (food.equalsIgnoreCase("Vegetable")) {
            System.out.println("Erk!");
        } else {
            System.out.println("I can't eat this!");
        }
    }

    private int energy = 100;


    public void work() {
        if (this.energy >= 25) {
            System.out.println("I'm working T.T");
            this.energy -= 9;
        } else {
            System.out.println("Heyyy... I'm too sleepy, better take a nap!");
            this.energy += 50;
        }
    }

    public void fraternize(Gecko buddy) {
        if (this.energy >= 30 && buddy.getEnergy() >= 30) {
            System.out.println("Hello " + buddy.getName() + "!");
            buddy.hello(this.name);
            this.energy -= 9;
            buddy.setEnergy(buddy.getEnergy() - 9);
        } else {
            System.out.println("...");
        }
    }

    public void nap() {
        System.out.println("zzzZZZzzzZZZzzz");
        this.energy += 50;
    }

    public void hunt() {
        if (this.energy >= 50) {
            System.out.println("I'm going to hunt!");
            this.energy -= 30;
            int random = (int) (Math.random() * 3);
            switch (random) {
                case 0:
                    System.out.println("I caught a lizard!");
                    this.energy += 30;
                    break;
                case 1:
                    System.out.println("I caught a butterfly!");
                    this.energy += 10;
                    break;
                case 2:
                    System.out.println("I caught a spider!");
                    this.energy += 25;
                    break;
            }
        } else {
            System.out.println("I'm too hungry to hunt...");
        }
    }

    public void fight(Gecko opponent, String weapon) {
        if (this.energy >= 20 && opponent.getEnergy() >= 20) {
            System.out.println("I'm going to fight " + opponent.getName() + " using " + weapon + "!");
            this.energy -= 20;
            opponent.setEnergy(opponent.getEnergy() - 20);
            int random = (int) (Math.random() * 3);
            switch (random) {
                case 0:
                    System.out.println("I won!");
                    this.energy += 20;
                    break;
                case 1:
                    System.out.println("I lost...");
                    opponent.setEnergy(opponent.getEnergy() + 20);
                    break;
                case 2:
                    System.out.println("I'm too tired to fight...");
                    this.energy += 10;
                    opponent.setEnergy(opponent.getEnergy() + 10);
                    break;
            }
        } else {
            System.out.println("I'm too tired to fight...");
        }
    }

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
