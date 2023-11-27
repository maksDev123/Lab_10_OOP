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
        } else {
            System.out.println("Parsing");
            super.parse();
            isInCache = true;
        }
    }
}
