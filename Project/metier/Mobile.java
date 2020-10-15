//package sokaban.metier;

public class Mobile extends Element{
	public Configuration config;
	public Position position;

	public Mobile(Type type, Configuration config, Position position){
		super(type);
	    this.config = config;
	    this.position = position;
	}

    public boolean setPosition(Position pos){
    	return true; //A coder
    }
    public Position getPosition(){
    	return this.position;
	}
	public boolean bougerVers(Direction dir){
		position = position.add(dir);
		return true;
	}

}
