package org.opensearch.index.analysis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.lucene.analysis.Analyzer;
import org.opensearch.common.settings.Settings;
import org.opensearch.env.Environment;
import org.opensearch.index.IndexSettings;

public class CustomWIPAnalyzerProvider extends AbstractIndexAnalyzerProvider<Analyzer> {
    private static final Logger LOGGER = LogManager.getLogger(CustomWIPAnalyzerProvider.class);
    public CustomWIPAnalyzerProvider(IndexSettings indexSettings, Environment env, String name, Settings settings) {
        super(indexSettings, name, settings);
    }

    @Override
    public Analyzer get() {
        LOGGER.info("Loaded CustomWIPAnalyzer");
        return new CustomWIPAnalyzer();
    }
}
