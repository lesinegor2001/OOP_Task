import java.util.ArrayList;
import java.util.Collections;

public class DominoGame {
    private ArrayList<DominoTile> dominoTiles;

    public DominoGame() {
        dominoTiles = new ArrayList<>();
        // создаем 28 костяшек домино
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                DominoTile tile = new DominoTile(i, j);
                dominoTiles.add(tile);
            }
        }
        // перемешиваем костяшки
        Collections.shuffle(dominoTiles);
    }

    // метод для раздачи костяшек игрокам
    public ArrayList<DominoTile> dealTiles(int numTiles) {
        ArrayList<DominoTile> tiles = new ArrayList<>();
        for (int i = 0; i < numTiles; i++) {
            tiles.add(dominoTiles.remove(0));
        }
        return tiles;
    }

    // класс для представления костяшки домино
    private static class DominoTile {
        private int left;
        private int right;

        public DominoTile(int left, int right) {
            this.left = left;
            this.right = right;
        }

        public int getLeft() {
            return left;
        }

        public int getRight() {
            return right;
        }

        @Override
        public String toString() {
            return "[" + left + "|" + right + "]";
        }
    }

    public static void main(String[] args) {
        DominoGame game = new DominoGame();
        ArrayList<DominoTile> player1Tiles = game.dealTiles(7);
        ArrayList<DominoTile> player2Tiles = game.dealTiles(7);

        System.out.println("Игроку 1 выпали костяшки: " + player1Tiles);
        System.out.println("Игроку 2 выпали костяшки: " + player2Tiles);
    }
}
