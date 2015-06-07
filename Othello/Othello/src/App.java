
		// Fig. 11.10: TextFieldTest.java
		// Testing TextFieldFrame.
		import javax.swing.JFrame;
		
		public class App
		{
		   public static void main( String args[] )
		   {  Test t = new Test(1);
		      String s=t.toString();
		      s=s+"just testing";
		   
		      // Sample application 
			  System.out.println("Java application");
			  BoardFrame board = new BoardFrame();
		      board.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		      board.setSize( 600,600); // set frame size
		      board.setVisible( true ); // display frame
		      
		   } // end main
		} // end class TextFieldTest
