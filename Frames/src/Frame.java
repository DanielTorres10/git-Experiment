import javax.swing.JFrame;

public class Frame 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		frame.setSize(500,600);
		frame.setTitle("An Alien");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Art component = new Art();
		frame.add(component);
		
		frame.setVisible(true);
	}

}
