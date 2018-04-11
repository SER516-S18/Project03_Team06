package client.listener;

import java.awt.Color;
import java.util.ArrayList;

/**
 * Affective panel action listener.
 * 
 * @author Team06
 * @version 1.0
 */
public interface AffectiveColorListener {

	public void setColor();

	public ArrayList<Color> getColors();

	void changedisplayLengthLabel(String text);

}