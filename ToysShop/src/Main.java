import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Toy> collect = new ArrayList();
        collect.add(new Toy(1, "Юла", 25));
        collect.add(new Toy(2, "Мяч", 25));
        collect.add(new Toy(3, "Мишка", 25));
        collect.add(new Toy(4, "Пистолет", 25));
        PrizeMachine machine = new PrizeMachine();

        for (int i = 0; i <= 20; i++) {
            Random random = new Random();
            int number = random.ints(0, 4).findFirst().getAsInt();
            Toy data = collect.get(number);
            machine.PutData(data);
        }
        for (int i = 0; i < 5; i++) {
            String getPrize = String.valueOf(machine.next());
            try (FileWriter writer = new FileWriter("prizeToys.txt", true)) {
                writer.write(getPrize);
                writer.write('\n');
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
