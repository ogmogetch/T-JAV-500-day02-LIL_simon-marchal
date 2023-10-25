public class Gecko {
    private String name;
    private int age;
    private int energy = 100;

    public Gecko(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Hello " + name + "!");
    }

    public Gecko(String name) {
        this(name, 0);
    }

    public Gecko() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Hello!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        if (energy > 100) {
            this.energy = 100;
        } else if (energy < 0) {
            this.energy = 0;
        } else {
            this.energy = energy;
        }
    }

    public void eat(String food) {
        switch (food.toLowerCase()) {
            case "meat":
                setEnergy(energy + 10);
                System.out.println("Yummy!");
                break;
            case "vegetable":
                setEnergy(energy - 10);
                System.out.println("Erk!");
                break;
            default:
                System.out.println("I can't eat this!");
                break;
        }
    }


    public void work() {
        if (energy >= 25) {
            setEnergy(energy - 9);
            System.out.println("I'm working T.T");
        } else {
            setEnergy(energy + 50);
            System.out.println("Heyyy I'm too sleepy, better take a nap!");
        }
    }

    public void hello(String recipient) {
        System.out.println("Hello " + recipient + ", I'm " + name + "!");
    }

    public void hello(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello, I'm " + name + "!");
        }
    }

    public void status() {
        switch (age) {
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

       public void fraternize(Object friend) {
        if (friend instanceof Gecko) {
            Gecko geckoFriend = (Gecko) friend;
            if (this.energy >= 30 && geckoFriend.energy >= 30) {
                this.setEnergy(energy - 30);
                geckoFriend.setEnergy(geckoFriend.energy - 30);
                System.out.println("I'm going to drink with " + geckoFriend.name + "!");
                System.out.println("I'm going to drink with " + this.name + "!");
            } else if (this.energy < 30 && geckoFriend.energy < 30) {
                System.out.println("Not today!");
                System.out.println("Not today!");
            } else if (this.energy < 30) {
                System.out.println("Sorry " + geckoFriend.name + ", I'm too tired to go out tonight.");
                System.out.println("Oh! That's too bad, another time then!.");
            } else {          
                System.out.println("Sorry " + this.name + ", I'm too tired to go out tonight.");
                System.out.println("Oh! That's too bad, another time then!");
            }
        } else if (friend instanceof Snake) {
            if (this.energy >= 10) {
                System.out.println("LET'S RUN AWAY!!!");
                this.energy = 0;
            } else {
                System.out.println("...");
            }
        }
    }
}
