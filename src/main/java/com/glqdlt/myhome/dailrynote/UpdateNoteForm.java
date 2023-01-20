package com.glqdlt.myhome.dailrynote;

/**
 * @author glqdlt
 */
public class UpdateNoteForm implements SavedNote {
    private String id;
    private String contents;
    private String title;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
