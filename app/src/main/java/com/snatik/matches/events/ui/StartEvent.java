package rocks.nolanperry.snatik.events.ui;

import rocks.nolanperry.snatik.events.AbstractEvent;
import rocks.nolanperry.snatik.events.EventObserver;

/**
 * When the 'back to menu' was pressed.
 */
public class StartEvent extends AbstractEvent {

	public static final String TYPE = StartEvent.class.getName();

	@Override
	protected void fire(EventObserver eventObserver) {
		eventObserver.onEvent(this);
	}

	@Override
	public String getType() {
		return TYPE;
	}

}
