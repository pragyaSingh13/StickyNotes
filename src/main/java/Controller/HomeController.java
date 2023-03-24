package Controller;


import Model.Note;
import Repository.NoteRepo;
import Service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableAutoConfiguration
public class HomeController
{

    @Autowired(required=true)
    private NotesService notesService;

    @PostMapping("/addNote")
    public ResponseEntity<?> addNote(@RequestBody Note note){

        // this method returns ResponseEntity<String>
       return notesService.addNote(note);
    }

    @GetMapping("/getNotes")

    public ResponseEntity<?> getAllNotes(){

        //this method returns ResponseEntity<?>
        System.out.println("working here");
        return notesService.getAllNotes();
    }
}
