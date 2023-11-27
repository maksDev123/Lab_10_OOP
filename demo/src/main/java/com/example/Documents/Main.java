package com.example.Documents;

import java.sql.Time;

public class Main {
    public static void main(String[] args) {
            SmartDocument a =  new SmartDocument("../завантаження.jpg");
            
            TimedDocument timed_Document =  new TimedDocument("../завантаження.jpg");

            CachedDocument cachedDocument =  new CachedDocument("../завантаження.jpg");

            a.parse();

            timed_Document.parse();

            cachedDocument.parse();
    }
}
