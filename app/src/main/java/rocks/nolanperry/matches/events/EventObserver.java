package rocks.nolanperry.matches.events;

import rocks.nolanperry.matches.events.engine.FlipDownCardsEvent;
import rocks.nolanperry.matches.events.engine.GameWonEvent;
import rocks.nolanperry.matches.events.engine.HidePairCardsEvent;
import rocks.nolanperry.matches.events.ui.BackGameEvent;
import rocks.nolanperry.matches.events.ui.DifficultySelectedEvent;
import rocks.nolanperry.matches.events.ui.FlipCardEvent;
import rocks.nolanperry.matches.events.ui.NextGameEvent;
import rocks.nolanperry.matches.events.ui.ResetBackgroundEvent;
import rocks.nolanperry.matches.events.ui.StartEvent;
import rocks.nolanperry.matches.events.ui.ThemeSelectedEvent;


public interface EventObserver {

	void onEvent(FlipCardEvent event);

	void onEvent(DifficultySelectedEvent event);

	void onEvent(HidePairCardsEvent event);

	void onEvent(FlipDownCardsEvent event);

	void onEvent(StartEvent event);

	void onEvent(ThemeSelectedEvent event);

	void onEvent(GameWonEvent event);

	void onEvent(BackGameEvent event);

	void onEvent(NextGameEvent event);

	void onEvent(ResetBackgroundEvent event);

}
