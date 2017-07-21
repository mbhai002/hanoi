public class hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			moves(20,'a','c','b');

		
		}

	 static void moves(int disk, char start, char last, char spare){

		  if (disk==1){
				System.out.println("move "+ start+ " to " + last);
			}
			else{
				
			moves(disk-1,start,spare,last);
			System.out.println("move "+ start+ " to " + last);
			moves(disk-1,spare,last,start);
	 }

	}

}