package org.opensearch.index.analysis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.standard.StandardTokenizer;

public class CustomWIPAnalyzer extends Analyzer {
    private static final Logger LOGGER = LogManager.getLogger(CustomWIPAnalyzer.class);

    @Override
    protected TokenStreamComponents createComponents(String field) {
        LOGGER.error("Tried to load a WIP Analyzer");
        Tokenizer tokenizer = new StandardTokenizer();
        return new TokenStreamComponents(tokenizer);
    }

}
