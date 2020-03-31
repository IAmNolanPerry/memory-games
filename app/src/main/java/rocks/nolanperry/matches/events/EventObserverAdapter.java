package rocks.nolanperry.matches.events;

import rocks.nolanperry.matches.events.engine.FlipDownCardsEvent;
import rocks.nolanperry.matches.events.engine.GameWonEvent;
import rocks.nolanperry.matches.events.engine.HidePairCardsEvent;
import rocks.nolanperry.matches.events.ui.BackGameEvent;
import rocks.nolanperry.matches.events.ui.FlipCardEvent;
import rocks.nolanperry.matches.events.ui.NextGameEvent;
import rocks.nolanperry.matches.events.ui.ResetBackgroundEvent;
import rocks.nolanperry.matches.events.ui.ThemeSelectedEvent;
import rocks.nolanperry.matches.events.ui.DifficultySelectedEvent;
import rocks.nolanperry.matches.events.ui.StartEvent;


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
