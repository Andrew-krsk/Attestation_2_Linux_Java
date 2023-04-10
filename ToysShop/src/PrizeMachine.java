import java.util.PriorityQueue;


public class PrizeMachine {
    private final PriorityQueue<Toy> prizeMachine;

    public PrizeMachine() {
        prizeMachine = new PriorityQueue<>((a, b) -> b.getWinningPercent() - a.getWinningPercent());
    }

    public void PutData(Toy data) {
        prizeMachine.add(data);
    }

    public Toy next() {
        return prizeMachine.poll();
    }

}
