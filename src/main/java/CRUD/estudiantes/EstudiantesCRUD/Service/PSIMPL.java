package CRUD.estudiantes.EstudiantesCRUD.Service;
import CRUD.estudiantes.EstudiantesCRUD.Entity.Student;
import CRUD.estudiantes.EstudiantesCRUD.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PSIMPL implements StudentService{
    @Autowired
    private StudentRepo repo;

    @Override
    public List<Student> ConsultarPersonas() {
        return (List<Student>) this.repo.findAll();
    }

    @Override
    public Student CrearPersona(Student persona) {
        persona.setEmail(persona.getEmail());
        return this.repo.save(persona);
    }

    @Override
    public Student modificarPersona(Student persona) {
        return this.repo.save(persona);
    }

    @Override
    public Student BuscarPersona(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarPersona(int id) {
        this.repo.deleteById(id);
    }
}
