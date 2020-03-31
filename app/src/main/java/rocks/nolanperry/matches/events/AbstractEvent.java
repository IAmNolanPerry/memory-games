package rocks.nolanperry.snatik.events;

public abstract class AbstractEvent implements Event {

	protected abstract void fire(EventObserver eventObserver);

}
