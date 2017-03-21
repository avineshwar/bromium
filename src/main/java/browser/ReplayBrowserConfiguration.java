package browser;

import config.ApplicationConfiguration;
import execution.DefaultApplicationActionFactory;
import execution.WebDriverActionExecutor;
import execution.WebdriverActionFactory;
import replay.ReplayBrowser;
import utils.Utils;

import java.io.IOException;
import java.net.URL;

/**
 * Created by hvrigazov on 19.03.17.
 */
public class ReplayBrowserConfiguration {
    private ReplayBrowser replayBrowser;

    public static Builder builder() {
        return new ReplayBrowserConfiguration.Builder();
    }

    public ReplayBrowserConfiguration(Builder builder) throws IOException {
        ApplicationConfiguration applicationConfiguration = Utils.parseApplicationConfiguration(builder.pathToApplicationConfiguration);
        WebDriverActionExecutor webDriverActionExecutor = builder.webDriverActionExecutor;
        URL url = new URL(builder.url);
        webDriverActionExecutor.addToWhiteList(url.getHost());
        WebdriverActionFactory webdriverActionFactory = builder.webdriverActionFactory;
        DefaultApplicationActionFactory applicationActionFactory = new DefaultApplicationActionFactory(builder.url, applicationConfiguration, webdriverActionFactory);
        replayBrowser = new ReplayBrowser(webDriverActionExecutor, applicationActionFactory);
    }

    public ReplayBrowser getReplayBrowser() {
        return replayBrowser;
    }

    public static class Builder {
        private String pathToApplicationConfiguration;
        private WebDriverActionExecutor webDriverActionExecutor;
        private WebdriverActionFactory webdriverActionFactory;
        private String url;

        public Builder pathToApplicationConfiguration(String pathToApplicationConfiguration) {
            this.pathToApplicationConfiguration = pathToApplicationConfiguration;
            return this;
        }

        public Builder executor(WebDriverActionExecutor executor) {
            this.webDriverActionExecutor = executor;
            return this;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder webdriverActionFactory(WebdriverActionFactory webdriverActionFactory) {
            this.webdriverActionFactory = webdriverActionFactory;
            return this;
        }

        public ReplayBrowserConfiguration build() throws IOException {
            return new ReplayBrowserConfiguration(this);
        }
    }

}