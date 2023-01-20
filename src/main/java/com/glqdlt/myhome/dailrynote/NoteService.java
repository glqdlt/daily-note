package com.glqdlt.myhome.dailrynote;

import org.springframework.stereotype.Service;

/**
 * @author glqdlt
 */
@Service
public class NoteService {

    public String readContents(String id) {
        return SAMPLE_CONTENTS;
    }

    public SavedNote savedNote(SavedNote savedNote) {
        return savedNote;
    }

    private static final String SAMPLE_CONTENTS = "## HELLOT\n" +
            "\n" +
            "hiqwe\n" +
            "\n" +
            "\n" +
            "$$uml\n" +
            "partition Conductor {\n" +
            "  (*) --> \"Climbs on Platform\"\n" +
            "  --> === S1 ===\n" +
            "  --> Bows\n" +
            "}\n" +
            "\n" +
            "partition Audience #LightSkyBlue {\n" +
            "  === S1 === --> Applauds\n" +
            "}\n" +
            "\n" +
            "partition Conductor {\n" +
            "  Bows --> === S2 ===\n" +
            "  --> WavesArmes\n" +
            "  Applauds --> === S2 ===\n" +
            "}\n" +
            "\n" +
            "partition Orchestra #CCCCEE {\n" +
            "  WavesArmes --> Introduction\n" +
            "  --> \"Play music\"\n" +
            "}\n" +
            "$$" +
            "\n" +
            "" +
            "```js\n" +
            "console.log('foo')\n" +
            "```\n" +
            "```javascript\n" +
            "console.log('bar')\n" +
            "```\n" +
            "```html\n" +
            "<div id=\"editor\"><span>baz</span></div>\n" +
            "```\n" +
            "```wrong\n" +
            "[1 2 3]\n" +
            "```\n" +
            "```clojure\n" +
            "[1 2 3]\n" +
            "```";


}
