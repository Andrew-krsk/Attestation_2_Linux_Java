public class Toy {
    private int ID;
    private String name;
    private final int winningPercent;

    public int getWinningPercent() {
        return winningPercent;
    }

    public Toy(int ID, String name, int winningPercent) {
        this.ID = ID;
        this.name = name;
        this.winningPercent = winningPercent;
    }


    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return ("Игрушка №%d, имя: %s").formatted(this.getID(), this.getName());
    }
}
