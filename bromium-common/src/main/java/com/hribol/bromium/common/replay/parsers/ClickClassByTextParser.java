package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.common.replay.actions.ClickClassByText;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.function.Function;

import static com.hribol.bromium.core.utils.Constants.TEXT;

/**
 * A parser for {@link ClickClassByText}
 */
public class ClickClassByTextParser implements WebDriverActionParameterParser {

    public static final String INITIAL_COLLECTOR_CLASS = "class";

    @Override
    public WebDriverAction create(Map<String, String> parameters, int step, boolean expectHttpRequest, Function<WebDriver, SearchContext> contextProvider) {
        String initialCollectorClass = parameters.get(INITIAL_COLLECTOR_CLASS);
        String text = parameters.get(TEXT);
        return new ClickClassByText(initialCollectorClass, text, expectHttpRequest);
    }
}
