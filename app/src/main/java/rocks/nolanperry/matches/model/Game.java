package rocks.nolanperry.matches.model;

import rocks.nolanperry.matches.themes.Theme;

/**
 * This is instance of active playing game
 * 
 * @author sromku
 */
public class Game {

	/**
	 * The board configuration
	 */
	public BoardConfiguration boardConfiguration;

	/**
	 * The board arrangment
	 */
	public BoardArrangment boardArrangment;

	/**
	 * The selected theme
	 */
	public Theme theme;

	public GameState gameState;

}
