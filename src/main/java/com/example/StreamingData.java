package com.example;

import javaslang.Tuple;
import javaslang.collection.HashMap;
import javaslang.collection.Map;
import rx.Observable;

class StreamingData {

    static final Observable<String> phoneNumbers =
            Observable.from(new String[]{
                    "+48413422345",
                    "413572456",
                    "+48413456990",
                    "48225697246",
                    "+48224914634",
                    "48126434972",
                    "+48128275242"
            });

    static final Map<String, String> areas =
            HashMap.ofEntries(
                    Tuple.of("41", "Kielce"),
                    Tuple.of("22", "Warszawa"),
                    Tuple.of("12", "Kraków")
            );

}
