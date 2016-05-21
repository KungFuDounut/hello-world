import javax.swing.JFrame;
/**
 * Creates the frame the game will be played on
 * @author Tyron
 *
 */
public class Frame extends JFrame{

	private MenuPanel menuPanel;
	/**
	 * Default constructor of the frame
	 */
	public Frame(){
		this(800, 600);
	}
	/**
	 * Constructor for the frame which allows for specfic size
	 * @param x the length of the frame
	 * @param y the width of the frame
	 */
	public Frame(int x, int y){
		menuPanel = new MenuPanel();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(x,y);
		setVisible(true);
		add(menuPanel);
	}
}
