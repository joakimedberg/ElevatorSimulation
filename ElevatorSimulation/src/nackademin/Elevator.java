package nackademin;

/**
 * A simulation of an elevator.
 * Assignment 3, part 1. Javautveckling @ Nackademin -20.
 * @author Joakim Edberg
 *
 */
public class Elevator {

	/** The current level of the elevator. */
	private int level;

	/**
	 * Constructs a elevator at given level. 
	 * <p>
	 * A constructor that receives the starting level as argument. If the argument is faulty it sets the level to 0.
	 * @param level the starting level of the elevator (-2 <= x <= 10)
	 */
	public Elevator(int level) {

		try {
			if (level >= -2 && level <= 10) {
				this.level = level;
			} else {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Våning är inte tillgänglig och sätts automatiskt till 0.");
		}
	}
	/**
	 * Changes the level of the elevator.
	 * 
	 * @param goToLevel next level (-2 <= x <= 10)
	 */
	public void goTo(int goToLevel) {
		try {
			if (goToLevel >= -2 && goToLevel <= 10) {
				if (goToLevel < level) {
					level = goToLevel;
					System.out.println("Hissen åker ner till våning " + level);
				} else if (goToLevel > level) {
					level = goToLevel;
					System.out.println("Hissen åker upp till våning " + level);
				} else {
					System.out.println("Hissen står redan på våning " + level);
				}

			}else {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Våning är inte tillgänglig.");
		}
		

	}
	/**
	 * Returns the current level of the elevator.
	 * @return the current level 
	 */
	public int where() {
		return level;
	}
}

class Test {

	public static void main(String[] args) {
		Elevator elevator1 = new Elevator(11);
		elevator1.goTo(9);
		elevator1.goTo(11);
		System.out.println(elevator1.where());
		elevator1.goTo(4);
		System.out.println(elevator1.where());
		
		Elevator elevator2 = new Elevator(5);
		elevator2.goTo(5);

	}
}