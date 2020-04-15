package rocks.nolanperry.matches;

import android.app.Application;

import rocks.nolanperry.matches.utils.FontLoader;

public class GameApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		FontLoader.loadFonts(this);
		new Instabug.Builder(this, "3c725f89e94d2eebe860a4ddc3025cb0")
      .setInvocationEvents(
        InstabugInvocationEvent.SHAKE,
        InstabugInvocationEvent.FLOATING_BUTTON)
      .build();

	}
}
