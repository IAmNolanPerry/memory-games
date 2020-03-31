package rocks.nolanperry.snatik.events.ui;

import rocks.nolanperry.snatik.events.AbstractEvent;
import rocks.nolanperry.snatik.events.EventObserver;
import rocks.nolanperry.snatik.themes.Theme;

public class ThemeSelectedEvent extends AbstractEvent {

	public static final String TYPE = ThemeSelectedEvent.class.getName();
	public final Theme theme;

	public ThemeSelectedEvent(Theme theme) {
		this.theme = theme;
	}

	@Override
	protected void fire(EventObserver eventObserver) {
		eventObserver.onEvent(this);
	}

	@Override
	public String getType() {
		return TYPE;
	}

}
