
import java.util.ArrayList;
import java.util.Scanner;
	public class Player {
		private int NumofBombs= 12 ;
		private String cell="";
		private ArrayList row;
		
				
		public void SetNumOfBombs() {
			}
		
		public int GetNumofBombs() {
			return NumofBombs;
		}
		
		public  void Move(ArrayList lowergrid, ArrayList uppergrid) {
			System.out.println(uppergrid.get(0));
			System.out.println(uppergrid.get(1));
			System.out.println(uppergrid.get(2));
			System.out.println(uppergrid.get(3));
			System.out.println(uppergrid.get(4));
			System.out.println(uppergrid.get(5));
			
			while( cell!="[B]") {
			
				Scanner scanrow = new Scanner(System.in);
		
				System.out.println("Enter row(1-6) and column(1-6):");
		
		
				int RowNum = scanrow.nextInt(); //get row input
		
				int ColumnNum = (scanrow.nextInt()-1);// get column input
				
				
				if (RowNum==1) {               // find which box is chosen
					row = (ArrayList) lowergrid.get(0);
					cell = (String) row.get(ColumnNum);
					if ( cell != "[B]") {
						((ArrayList) uppergrid.get(0)).set(ColumnNum, cell);
						System.out.println(uppergrid.get(0));
						System.out.println(uppergrid.get(1));
						System.out.println(uppergrid.get(2));
						System.out.println(uppergrid.get(3));
						System.out.println(uppergrid.get(4));
						System.out.println(uppergrid.get(5));
					}
				}
				if (RowNum == 2) {
					row = (ArrayList) lowergrid.get(1);
					cell = (String) row.get(ColumnNum);
					if ( cell != "[B]") {
						((ArrayList) uppergrid.get(1)).set(ColumnNum, cell);
						System.out.println(uppergrid.get(0));
						System.out.println(uppergrid.get(1));
						System.out.println(uppergrid.get(2));
						System.out.println(uppergrid.get(3));
						System.out.println(uppergrid.get(4));
						System.out.println(uppergrid.get(5));
					
				}}
				if (RowNum == 3) {
					row = (ArrayList) lowergrid.get(2);
					cell = (String) row.get(ColumnNum);
					if ( cell != "[B]") {
						((ArrayList) uppergrid.get(2)).set(ColumnNum, cell);
						System.out.println(uppergrid.get(0));
						System.out.println(uppergrid.get(1));
						System.out.println(uppergrid.get(2));
						System.out.println(uppergrid.get(3));
						System.out.println(uppergrid.get(4));
						System.out.println(uppergrid.get(5));
				}}
				if (RowNum == 4) { 
					row = (ArrayList) lowergrid.get(3);
					cell = (String) row.get(ColumnNum);
					if ( cell != "[B]") {
						((ArrayList) uppergrid.get(3)).set(ColumnNum, cell);
						System.out.println(uppergrid.get(0));
						System.out.println(uppergrid.get(1));
						System.out.println(uppergrid.get(2));
						System.out.println(uppergrid.get(3));
						System.out.println(uppergrid.get(4));
						System.out.println(uppergrid.get(5));
				}}
				if (RowNum == 5) {
					row = (ArrayList) lowergrid.get(4);
					cell = (String) row.get(ColumnNum);
					if ( cell != "[B]") {
						((ArrayList) uppergrid.get(4)).set(ColumnNum, cell);
						System.out.println(uppergrid.get(0));
						System.out.println(uppergrid.get(1));
						System.out.println(uppergrid.get(2));
						System.out.println(uppergrid.get(3));
						System.out.println(uppergrid.get(4));
						System.out.println(uppergrid.get(5));
				}}
				if (RowNum == 6) {
					row = (ArrayList) lowergrid.get(5);
					cell = (String) row.get(ColumnNum);
					if ( cell != "[B]") {
						((ArrayList) uppergrid.get(5)).set(ColumnNum, cell);
						System.out.println(uppergrid.get(0));
						System.out.println(uppergrid.get(1));
						System.out.println(uppergrid.get(2));
						System.out.println(uppergrid.get(3));
						System.out.println(uppergrid.get(4));
						System.out.println(uppergrid.get(5));
				}}
				
				
			
			// if bomb is in cell you lose
				if (cell== "[B]") {
					System.out.println("Game Over");
					System.out.println("You have Clicked on a Bomb!");}
				
		}
			
		}
	}
		
	