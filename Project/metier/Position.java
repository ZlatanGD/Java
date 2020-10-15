//package sokaban.metier;

public class Position {
	public final int x;
    public final int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Position(Position Pos){
        this(Pos.x, Pos.y);
    }

    public Position add(Direction Direc){
        return new Position(this.x + Direc.label.x, this.y + Direc.label.y);
    }

    public Position sub(Direction Direc){
        return new Position(this.x - Direc.label.x, this.y - Direc.label.y);
    }

    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Position D = (Position) obj;
        return (this.x != D.x) && (this.y != D.y);
    }
}
