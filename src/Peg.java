import java.awt.Color;

public class Peg{

	private Color pegColor;
	
	public Peg(Color pegColor){
		this.pegColor = pegColor;
	}
	
	public Color getPegColor(){
		return pegColor;
	}
	
	public boolean equals(Object other) {
		return other != null && other instanceof Peg
				&& ((Peg) other).getPegColor().equals(pegColor);
	}
}
