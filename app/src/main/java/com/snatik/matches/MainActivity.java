package rocks.nolanperry.snatik;


import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;

import rocks.nolanperry.snatik.common.Shared;
import rocks.nolanperry.snatik.engine.Engine;
import rocks.nolanperry.snatik.engine.ScreenController;
import rocks.nolanperry.snatik.engine.ScreenController.Screen;
import rocks.nolanperry.snatik.events.EventBus;
import rocks.nolanperry.snatik.events.ui.BackGameEvent;
import rocks.nolanperry.snatik.ui.PopupManager;
import rocks.nolanperry.snatik.utils.Utils;

public class MainActivity extends FragmentActivity {

	private ImageView mBackgroundImage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Shared.context = getApplicationContext();
		Shared.engine = Engine.getInstance();
		Shared.eventBus = EventBus.getInstance();

		setContentView(R.layout.activity_main);
		mBackgroundImage = (ImageView) findViewById(R.id.background_image);

		Shared.activity = this;
		Shared.engine.start();
		Shared.engine.setBackgroundImageView(mBackgroundImage);

		// set background
		setBackgroundImage();

		// set menu
		ScreenController.getInstance().openScreen(Screen.MENU);


	}

	@Override
	protected void onDestroy() {
		Shared.engine.stop();
		super.onDestroy();
	}

	@Override
	public void onBackPressed() {
		if (PopupManager.isShown()) {
			PopupManager.closePopup();
			if (ScreenController.getLastScreen() == Screen.GAME) {
				Shared.eventBus.notify(new BackGameEvent());
			}
		} else if (ScreenController.getInstance().onBack()) {
			super.onBackPressed();
		}
	}

	private void setBackgroundImage() {
		Bitmap bitmap = Utils.scaleDown(R.drawable.background, Utils.screenWidth(), Utils.screenHeight());
		bitmap = Utils.crop(bitmap, Utils.screenHeight(), Utils.screenWidth());
		bitmap = Utils.downscaleBitmap(bitmap, 2);
		mBackgroundImage.setImageBitmap(bitmap);
	}

}
