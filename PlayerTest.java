import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class PlayerTest {

	public static void main(String[] args) {
		Player c = new Player();
		Grids  lower = new Grids();
		lower.Grids('N');
		ArrayList lowergrid = lower.setLowerBoard();
		Grids  upper = new Grids();
		upper.Grids('N');
		ArrayList uppergrid= upper.setLowerBoard();
		c.Move(lowergrid);

	}

}