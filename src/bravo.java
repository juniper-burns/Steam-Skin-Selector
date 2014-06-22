
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.util.Random;


public class bravo extends JFrame{
	
	private int i;
	private JTextField num;
	
	public bravo() {
		super("Steam Skin Selector v0.1");
		Random r = new Random();
		
		i = r.nextInt(49);
		i++;
		
		num = new JTextField("" + i,8);
		
		add(num);
	}
}
