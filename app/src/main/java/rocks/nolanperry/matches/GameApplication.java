package rocks.nolanperry.snatik;

import android.app.Application;

import rocks.nolanperry.snatik.utils.FontLoader;

public class GameApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		FontLoader.loadFonts(this);

	}
}
