

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
		

		public class BoardFrame extends JFrame 
		{
		   
			private final Icon blackIcon=new ImageIcon(getClass().getResource("black.png"));
			private final Icon whiteIcon=new ImageIcon(getClass().getResource("white.png"));
			private JButton grid[][]=new JButton[8][8];
			enum Status { EMPTY, BLACK, WHITE};
			private Status gridStatus [][]=new Status[8][8]; 
		   
		   //private JPanel panel=new JPanel();
		   
		   // TextFieldFrame constructor adds JTextFields to JFrame
		   public BoardFrame()
		   {
		      super( "Testing JTextField and JPasswordField" );
		      setLayout( new GridLayout(8,8)) ; // set frame layout
		      
		      BoardHandler handler = new BoardHandler();
		      for(int x=0; x<8; x++)
					for(int y=0; y<8; y++)
					{
						grid[x][y] = new JButton();
						add(grid[x][y]);
						grid[x][y].addActionListener(handler);
						gridStatus[x][y]=Status.EMPTY;
					}
		      grid[4][4].setIcon(blackIcon);
		      gridStatus[4][4]=Status.BLACK;
		      } // end TextFieldFrame constructor
				
				   // private inner class for event handling
			   private class BoardHandler implements ActionListener 
				   {
				      
				      // handle button event
				      public void actionPerformed( ActionEvent event )
				      {
				    	  int pos[]= getIJ(event);
				    	  
				    	  if (gridStatus[pos[0]][pos[1]] == Status.BLACK){
				    		  grid[pos[0]][pos[1]].setIcon(whiteIcon);
				    		  gridStatus[pos[0]][pos[1]] = Status.WHITE;
				    	
				    	  }	
				    	  else if (gridStatus[pos[0]][pos[1]] == Status.WHITE){
				    		  grid[pos[0]][pos[1]].setIcon(blackIcon);
				    		  gridStatus[pos[0]][pos[1]] = Status.BLACK;
				    	  }
				      } // end method actionPerformed
				      private  int[] getIJ(ActionEvent e)
				        {
				    	  JButton sourceButton = (JButton)e.getSource();
				        	int [] arr=new  int[2];
							for(int x=0; x<8; x++)
								for(int y=0; y<8; y++)
									if(sourceButton==grid[x][y])
									{
										arr[0]=x;
										arr[1]=y;
										break;
									}
							return arr;
						}
				   } // end private inner class ButtonHandler

	   } // end class TextFieldFrame


				

		
