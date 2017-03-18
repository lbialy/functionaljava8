package com.example;

import javaslang.Tuple;
import javaslang.collection.HashMap;
import javaslang.collection.HashSet;
import javaslang.collection.Map;
import javaslang.collection.Set;

class PhoneNumberData {

    static final Set<String> phoneNumbers =
            HashSet.of(
                    "+48413422345",
                    "413572456",
                    "+48413456990",
                    "48225697246",
                    "+48224914634",
                    "48126434972",
                    "+48128275242"
            );

    static final Map<String, String> areas =
            HashMap.ofEntries(
                    Tuple.of("41", "Kielce"),
                    Tuple.of("22", "Warszawa"),
                    Tuple.of("12", "Kraków")
            );

}
