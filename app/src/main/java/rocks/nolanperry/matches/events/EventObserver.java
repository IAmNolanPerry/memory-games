package rocks.nolanperry.snatik.events;

import rocks.nolanperry.snatik.events.engine.FlipDownCardsEvent;
import rocks.nolanperry.snatik.events.engine.GameWonEvent;
import rocks.nolanperry.snatik.events.engine.HidePairCardsEvent;
import rocks.nolanperry.snatik.events.ui.BackGameEvent;
import rocks.nolanperry.snatik.events.ui.DifficultySelectedEvent;
import rocks.nolanperry.snatik.events.ui.FlipCardEvent;
import rocks.nolanperry.snatik.events.ui.NextGameEvent;
import rocks.nolanperry.snatik.events.ui.ResetBackgroundEvent;
import rocks.nolanperry.snatik.events.ui.StartEvent;
import rocks.nolanperry.snatik.events.ui.ThemeSelectedEvent;


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
