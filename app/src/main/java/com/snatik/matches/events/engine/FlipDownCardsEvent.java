package rocks.nolanperry.snatik.events.engine;

import rocks.nolanperry.snatik.events.AbstractEvent;
import rocks.nolanperry.snatik.events.EventObserver;

/**
 * When the 'back to menu' was pressed.
 */
public class FlipDownCardsEvent extends AbstractEvent {

	public static final String TYPE = FlipDownCardsEvent.class.getName();

	public FlipDownCardsEvent() {
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
