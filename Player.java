import java.util.Scanner;
	public class Player {
		private int NumofBombs= 12 ;
		private String cell="";
				
		public void SetNumOfBombs() {
			}
		
		public int GetNumofBombs() {
			return NumofBombs;
		}
		public String Move() {
			while( cell!="B") {
				Scanner scanrow = new Scanner(System.in);
		
				System.out.println("enter row(1-6) and column(1-6):");
		
		
				int RowNum = scanrow.nextInt(); //get row input
		
				int ColumnNum = (scanrow.nextInt()-1);// get column input
				Grid grid = new Grid();
		
				if (RowNum==1) {               // find which box is chosen
					cell = (String)  grid.getRows().get(0).get(ColumnNum);
				}
				if (RowNum == 2) {
					cell =  (String) grid.getRows().get(1).get(ColumnNum);
				}
				if (RowNum == 3) {
					cell = (String) grid.getRows().get(2).get(ColumnNum);
				}
				if (RowNum == 4) {
					cell = (String) grid.getRows().get(3).get(ColumnNum);
				}
				if (RowNum == 5) {
					cell = (String) grid.getRows().get(4).get(ColumnNum);
				}
				if (RowNum == 6) {
					cell = (String) grid.getRows().get(5).get(ColumnNum);
				}
			}
			// if bomb is in cell you lose
				if (cell== "B") {
					System.out.println("Game Over");
					System.out.println("You have Clicked on a Bomb!");}
				
				return cell;
		}
	}
		
	
	

