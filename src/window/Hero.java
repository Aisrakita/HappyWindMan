package window;

public class Hero {
	int hp,mp;
	String name;
	
	void setHp(int value) {
		hp = value;
	}
	
	int getHp() {
		return hp;
	}
	
	void setMp(int value) {
		mp = value;
	}
	
	int getMp() {
		return mp;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
}
