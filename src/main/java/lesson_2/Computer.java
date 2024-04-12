package lesson_2;

public class Computer {
    int cost;
    int power;
    int RAMMemory;
    String processorType;

    public Computer(int cost, int power, int RAMMemory, String processorType) {
        this.cost = cost;
        this.power = power;
        this.RAMMemory = RAMMemory;
        this.processorType = processorType;
    }

    void includes(boolean isTurnedOn) {


        System.out.println("Я включился!");

    }
    void showInfo() {
        System.out.println(cost
                + "\n" + power
                + "\n" + RAMMemory
                + "\n" + processorType);
    }
}
