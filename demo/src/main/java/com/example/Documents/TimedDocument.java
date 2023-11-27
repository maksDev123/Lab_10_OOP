package com.example.Documents;

class TimedDocument extends SmartDocument {
    public TimedDocument(String content) {
        super(content);
    }

    public void parseAndMeasurePerformance() {
        long startTime = System.currentTimeMillis();

        super.parse();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Parsing took " + elapsedTime + " milliseconds");
    }
}
