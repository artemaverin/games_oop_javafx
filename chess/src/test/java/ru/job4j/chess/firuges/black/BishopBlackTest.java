package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    public void whenBishopPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A4);
        assertThat(bishopBlack.position(), is(Cell.A4));
    }

    @Test
    public void whenBishopCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Figure figure = bishopBlack.copy(Cell.A1);
        assertThat(bishopBlack.position(), is(figure.position()));
    }

    @Test
    public void whenBishopWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.way(Cell.G5), is(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }

    @Test
    public void whenBishopBlackDiagonal() {
        BishopBlack newFigure = new BishopBlack(Cell.C1);
        newFigure.way(Cell.G5);
    }
}