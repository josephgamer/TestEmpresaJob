package testEmpresa.controller;

import testEmpresa.excepciones.DaoExceptions;
import testEmpresa.excepciones.ServiceExceptions;
import testEmpresa.model.Vehiculo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import testEmpresa.service.VehiculoService;
import testEmpresa.service.VehiculoServiceImpl;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/api/cars")
@RestController
public class VehiculoControl {
    private VehiculoService service = new VehiculoServiceImpl();

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Vehiculo insertCar(@RequestBody Vehiculo vehiculo) {
        try {
            Vehiculo saved;
            saved = service.insertCar(vehiculo);
            return saved;
        } catch (DaoExceptions e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ServiceExceptions e) {
            throw new RuntimeException(e);
        }
    }

    @PutMapping(consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Vehiculo updateCar(@RequestBody Vehiculo vehiculo) {
        try {
            Vehiculo updated = service.updateCar(vehiculo);
            return updated;
        } catch (DaoExceptions | SQLException | ServiceExceptions ex) {
            Logger.getLogger(VehiculoControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @DeleteMapping("{id}")
    @ResponseBody
    public boolean deleteCar(@PathVariable String id) {
        try {
            boolean isDeleted = false;
            isDeleted = service.deleteCar(id);
            return isDeleted;
        } catch (DaoExceptions | SQLException | ServiceExceptions ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @GetMapping()
    @ResponseBody
    public List<Vehiculo> allCars() throws DaoExceptions, SQLException, ServiceExceptions {
        try {
            List allCars = service.listCars();
            return allCars;
        } catch (DaoExceptions | SQLException | ServiceExceptions ex) {
            Logger.getLogger(VehiculoControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @GetMapping("{codigo}")
    @ResponseBody
    public Vehiculo searchByID(@PathVariable String codigo) {
        try {
            Vehiculo result = null;
            result = service.searchByCode(codigo);
            return result;
        } catch (DaoExceptions | SQLException | ServiceExceptions ex) {
            Logger.getLogger(VehiculoControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
