package org.opensearch.index.analysis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.opensearch.index.IndexSettings;
import org.opensearch.env.Environment;
import org.opensearch.common.settings.Settings;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.te.TeluguAnalyzer;


public class TeluguAnalyzerProvider extends AbstractIndexAnalyzerProvider<Analyzer> {
    private static final Logger LOGGER = LogManager.getLogger(TeluguAnalyzerProvider.class);
    public TeluguAnalyzerProvider(IndexSettings indexSettings, Environment env, String name, Settings settings) {
         super(indexSettings, name, settings);
    }

    @Override
    public Analyzer get() {
         // For demonstration, return StandardAnalyzer.
         // Replace with your actual Telugu analyzer implementation.
        LOGGER.info("Loading TeluguAnalyzer");
        return new TeluguAnalyzer();
    }
}
