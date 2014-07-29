package main;

/**
 * Created by riki on 28.07.2014.
 */
public class Square {
    private int start;
    private int end;
    private int startrow;

    public int getStartrow() {
        return startrow;
    }

    public void setStartrow(int startrow) {
        this.startrow = startrow;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public Square(int start, int end, int row) {
        this.start = start;
        this.end = end;
        this.startrow = row;
    }

    public boolean isSquared(int row, int posx, char symbol) {
        //boolean  debug =((posx >= start && posx <= end) && ((end - start) >= (row - startrow)));
        if (row >= startrow) {
            if (symbol == '#') {
                return (!((posx >= start && posx <= end) && ((end - start) >= (row - startrow))));
            } else return (posx >= start && posx <= end) && ((end - start) >= (row - startrow));
        }
        return false;
    }
}