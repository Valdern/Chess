package sample.figures.white;

import sample.figures.Cell;
import sample.figures.Figure;

public class RookWhite implements Figure {
        private final Cell position;

        public RookWhite(final Cell position) {
            this.position = position;
        }

        @Override
        public Cell position() {
            return this.position;
        }

        @Override
        public Cell[] way(Cell source, Cell dest) {
            return new Cell[] { dest };
        }

        @Override
        public Figure copy(Cell dest) {
            return new RookWhite(dest);
        }
    }
