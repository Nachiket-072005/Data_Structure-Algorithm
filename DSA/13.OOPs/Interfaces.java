public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();
    }
}

interface ChessPlayer {
    void move();
} 

class Queen implements ChessPlayer {
    public void move() {
        System.out.println("up, down, right, left, diagonal (In all Direction)");
    }
}

class King implements ChessPlayer {
    public void move() {
        System.out.println("up, down, right, left, diagonal (In all Direction by step - 1)");
    }
}

class Rook implements ChessPlayer {
    public void move() {
        System.out.println("up, down, right, left");
    }
}