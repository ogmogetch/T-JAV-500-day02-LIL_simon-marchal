public class Gecko {
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
        // Assurez-vous que l'énergie ne dépasse pas 100 ou ne descend pas en dessous de 0
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
            System.out.println("Heyyy I'm too sleepy, better take a nap!");
            this.energy += 50;
        }
    }

    private int energy = 100;

    public void setEnergy(int energy) {
        // Assurez-vous que l'énergie ne dépasse pas 100 ou ne descend pas en dessous de 0
        if (energy > 100) {
            this.energy = 100;
        } else if (energy < 0) {
            this.energy = 0;
        } else {
            this.energy = energy;
        }
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

