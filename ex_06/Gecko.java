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
}
