import mineSweeperGame.Cell;
import mineSweeperGame.CellBoardGenerator;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CellBoardGeneratorTest {

    CellBoardGenerator cellBoardGenerator;

    @Before
    public void generateCellBoardGenerator() {
        cellBoardGenerator = new CellBoardGenerator();
    }

    @Test
    public void shouldGenerateRandomBooleans() {
        int counter = 0;
        Cell[][] cells = cellBoardGenerator.generateCells(8, 8, 10);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if (cells[i][j].getIsABomb()) {
                    counter++;
                }

            }

        }
        assertThat(counter).isEqualTo(10);

    }

    @Test
    public void shouldDisplayArrayOfCells() {
        int row = 16;
        int col = 32;
        int numberOfBombs = 99;
        Cell[][] cells = cellBoardGenerator.generateCells(row, col, numberOfBombs);


        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < col; j++) {
                if (cells[i][j].getIsABomb()) {
                    System.out.print("x");
                } else {
                    System.out.print(cells[i][j].getBombsAround());

                }
            }
        }
    }
}
