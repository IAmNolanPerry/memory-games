package rocks.nolanperry.matches;

import android.app.Application;

import rocks.nolanperry.matches.utils.FontLoader;

public class GameApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		FontLoader.loadFonts(this);

	}
}
