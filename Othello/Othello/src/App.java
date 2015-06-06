
		// Fig. 11.10: TextFieldTest.java
		// Testing TextFieldFrame.
		import javax.swing.JFrame;
		
		public class App
		{
		   public static void main( String args[] )
		   { 
		      // Sample application 
			  BoardFrame board = new BoardFrame();
		      board.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		      board.setSize( 500,500); // set frame size
		      board.setVisible( true ); // display frame
		   } // end main
		} // end class TextFieldTest
