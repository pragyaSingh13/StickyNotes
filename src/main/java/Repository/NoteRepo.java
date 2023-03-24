package Repository;

import Model.Note;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepo extends MongoRepository<Note, String> {


}
