package com.glqdlt.myhome.dailrynote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author glqdlt
 */
@Controller
@RequestMapping("/note")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @PutMapping("/detail/{id}")
    public ResponseEntity ddd(@PathVariable String id, @RequestBody UpdateNoteForm updateNoteForm) {

        SavedNote aa = noteService.savedNote(updateNoteForm);




    }

    @GetMapping("/detail/{id}")
    @ResponseBody
    public SavedNote ccc(@PathVariable String id) {
        String contents = noteService.readContents(id);
        SavedNote note
                = new SavedNote() {
            @Override
            public String getId() {
                return id;
            }

            @Override
            public String getContents() {
                return contents;
            }
        };
        return note;
    }

    @GetMapping("/viewer/{id}")
    public ModelAndView aaa(@PathVariable String id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("viewer");
        ModelMap model = modelAndView.getModelMap();
        model.addAttribute("id", id);
        return modelAndView;
    }

    @GetMapping("/editor/{id}")
    public ModelAndView aaab(@PathVariable String id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editor");
        ModelMap model = modelAndView.getModelMap();
        model.addAttribute("id", id);
        return modelAndView;
    }

}
