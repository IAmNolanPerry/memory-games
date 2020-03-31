package rocks.nolanperry.snatik.events;

import rocks.nolanperry.snatik.events.engine.FlipDownCardsEvent;
import rocks.nolanperry.snatik.events.engine.GameWonEvent;
import rocks.nolanperry.snatik.events.engine.HidePairCardsEvent;
import rocks.nolanperry.snatik.events.ui.BackGameEvent;
import rocks.nolanperry.snatik.events.ui.FlipCardEvent;
import rocks.nolanperry.snatik.events.ui.NextGameEvent;
import rocks.nolanperry.snatik.events.ui.ResetBackgroundEvent;
import rocks.nolanperry.snatik.events.ui.ThemeSelectedEvent;
import rocks.nolanperry.snatik.events.ui.DifficultySelectedEvent;
import rocks.nolanperry.snatik.events.ui.StartEvent;


public class EventObserverAdapter implements EventObserver {

	public void onEvent(FlipCardEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(DifficultySelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(HidePairCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(FlipDownCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(StartEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ThemeSelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(GameWonEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(BackGameEvent event) {
		throw new UnsupportedOperationException();		
	}

	@Override
	public void onEvent(NextGameEvent event) {
		throw new UnsupportedOperationException();		
	}

	@Override
	public void onEvent(ResetBackgroundEvent event) {
		throw new UnsupportedOperationException();		
	}

}
