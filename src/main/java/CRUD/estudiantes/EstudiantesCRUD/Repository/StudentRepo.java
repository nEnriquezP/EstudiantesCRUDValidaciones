package CRUD.estudiantes.EstudiantesCRUD.Repository;
import CRUD.estudiantes.EstudiantesCRUD.Entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {
}
