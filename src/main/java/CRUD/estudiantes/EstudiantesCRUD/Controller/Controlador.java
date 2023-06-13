package CRUD.estudiantes.EstudiantesCRUD.Controller;

import com.example.demo.Entity.Student;
import com.example.demo.Service.PSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CRUDRepo")
public class Controlador {

    @Autowired
    private PSIMPL psimpl;

    @GetMapping
    @RequestMapping(value = "ConsultarPersonas",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarPersonas(){
        List<Student> personaList=this.psimpl.ConsultarPersonas();
        return ResponseEntity.ok(personaList);
    }
    @PutMapping
    @RequestMapping(value = "CrearPersona",method = RequestMethod.POST)
    public ResponseEntity<?> CrearPersona(@RequestBody Student persona){
        Student personaCrear=this.psimpl.CrearPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(personaCrear);
    }
    @PutMapping
    @RequestMapping(value = "ModificarPersona",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarPersona(@RequestBody Student persona){
        Student personaModificada=this.psimpl.modificarPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(personaModificada);
    }
    @GetMapping
    @RequestMapping(value = "BuscarPersona/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarPersona(@PathVariable int id){
        Student persona=this.psimpl.BuscarPersona(id);
        return ResponseEntity.ok(persona);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarPersona/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarPersona(@PathVariable int id){
        this.psimpl.EliminarPersona(id);
        return ResponseEntity.ok().build();
    }
}
