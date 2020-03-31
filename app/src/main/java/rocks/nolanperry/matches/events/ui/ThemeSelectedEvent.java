package rocks.nolanperry.matches.events.ui;

import rocks.nolanperry.matches.events.AbstractEvent;
import rocks.nolanperry.matches.events.EventObserver;
import rocks.nolanperry.matches.themes.Theme;

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
