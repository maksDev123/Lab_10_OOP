package com.example.Documents;


class CachedDocument extends SmartDocument {
    private boolean isInCache;
    private static final String DB_URL = "jdbc:sqlite:document_cache.db";

    public CachedDocument(String content) {
        super(content);
        this.isInCache = false;
    }

    public void parseWithCaching() {
        if (isInCache) {
            System.out.println("Document found in cache. Skipping parsing.");
        } else {
            System.out.println("Document not found in cache. Parsing...");
            isInCache = true;
        }
    }
}
