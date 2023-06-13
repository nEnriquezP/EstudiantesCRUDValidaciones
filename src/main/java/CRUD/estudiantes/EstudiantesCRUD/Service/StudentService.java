package CRUD.estudiantes.EstudiantesCRUD.Service;
import CRUD.estudiantes.EstudiantesCRUD.Entity.Student;
import java.util.List;
public interface StudentService {

    public List<Student> ConsultarPersonas();
    public Student CrearPersona(Student persona);
    public Student modificarPersona(Student persona);
    public Student BuscarPersona(int id);
    public void EliminarPersona(int id);
}
