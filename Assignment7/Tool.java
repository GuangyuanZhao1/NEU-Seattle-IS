


class Tool {
	protected int strength;
	protected char type;
	
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public boolean fight() {
		return false;
	}
}

/* Implement class Scissors */

class Scissors extends Tool{
	public Scissors(int strength) {
		super.strength = strength;
		super.type = 's';
	}
	public boolean fight(Tool tool) {
		if(tool instanceof Paper) {
			return this.strength * 2 >= tool.strength;
		}
		else if(tool instanceof Rock) {
			return this.strength >= tool.strength * 2;
		}
		else {
			return this.strength >= tool.strength;
		}
	}
 	
}

/* Implement class Paper */

class Paper extends Tool{
	public Paper(int strength) {
		super.strength = strength;
		super.type = 'p';
	}
	public boolean fight(Tool tool) {
		if(tool instanceof Rock) {
			return this.strength * 2 >= tool.strength;
		}
		else if(tool instanceof Scissors) {
			return this.strength >= tool.strength * 2;
		}
		else {
			return this.strength >= tool.strength;
		}
	}
	
}

/* Implement class Rock */

class Rock extends Tool{
	public Rock(int strength) {
		this.strength = strength;
		this.type = 'r';
	}
	public boolean fight(Tool tool) {
		if(tool instanceof Scissors) {
			return this.strength * 2 >= tool.strength;
		}
		else if(tool instanceof Paper) {
			return this.strength >= tool.strength * 2;
		}
		else {
			return this.strength >= tool.strength;
		}
	}
}

