package org.opensearch.plugin.analysis.telugu;

import org.opensearch.index.analysis.CustomWIPAnalyzerProvider;
import org.opensearch.plugins.Plugin;
import org.opensearch.plugins.AnalysisPlugin;
import org.opensearch.index.analysis.AnalyzerProvider;
import org.opensearch.indices.analysis.AnalysisModule.AnalysisProvider;
import org.opensearch.index.analysis.TeluguAnalyzerProvider;
import org.apache.lucene.analysis.Analyzer;

import java.util.HashMap;
import java.util.Map;

public class TeluguPlugin extends Plugin implements AnalysisPlugin {
    @Override
    public Map<String, AnalysisProvider<AnalyzerProvider<? extends Analyzer>>> getAnalyzers() {
        Map<String, AnalysisProvider<AnalyzerProvider<? extends Analyzer>>> analyzer = new HashMap<>();
        analyzer.put("telugu", TeluguAnalyzerProvider::new);
        analyzer.put("customwip", CustomWIPAnalyzerProvider::new);
        return analyzer;
    }
}
