//package sokaban.metier;

public abstract class Element { //verifier si abstrait
public Type type;
	
	public Element(Type type){
		this.type = type;
	}

	public abstract boolean bougerVers(Direction dir);

	public Type getType(){
		return type;
	}
}
