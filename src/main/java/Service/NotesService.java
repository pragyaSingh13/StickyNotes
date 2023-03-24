package Service;

import Model.Note;
import Repository.NoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Component
public class NotesService {

    @Autowired(required=true)
    private NoteRepo noteRepo ;

    public ResponseEntity<?> addNote(Note note){
        try{
            note.setDateCreated(new Date(System.currentTimeMillis()));
            note.setLastEdited(new Date(System.currentTimeMillis()));
            noteRepo.save(note);

            return new ResponseEntity<String>("Note added successfully "+note.getId(), HttpStatus.OK);

        }catch(Exception ex){

            return new ResponseEntity<String>("Something went wrong! "+ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<?> getAllNotes(){

        System.out.println("this is in service");
        try{
            List<Note> notes = noteRepo.findAll();

            if(notes.size() > 0){
                return new ResponseEntity<List<Note>>(notes, HttpStatus.OK);

            }else{
                return new ResponseEntity<String>("Oops! No notes found!", HttpStatus.OK);
            }

        }catch(Exception ex){

            return new ResponseEntity<String>("Oops! Something went wrong \n"+ex.getMessage(), HttpStatus.OK);
        }

    }

}
