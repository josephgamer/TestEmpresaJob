package testEmpresa.service;

import testEmpresa.dao.VehiculoDao;
import testEmpresa.dao.VehiculoDaoImpl;
import testEmpresa.excepciones.DaoExceptions;
import testEmpresa.excepciones.ServiceExceptions;
import testEmpresa.model.Vehiculo;

import java.sql.SQLException;
import java.util.List;

public class VehiculoServiceImpl implements VehiculoService{
    private VehiculoDao dao;

    @Override
    public List<Vehiculo> listCars() throws DaoExceptions, SQLException, ServiceExceptions {
        List<Vehiculo> cars = null;
        this.dao = new VehiculoDaoImpl();
        cars = this.dao.listCars();
        return cars;
    }

    @Override
    public Vehiculo insertCar(Vehiculo vehiculo) throws DaoExceptions, SQLException, ServiceExceptions {
        Vehiculo saved;
        this.dao = new VehiculoDaoImpl();
        saved = this.dao.insertCar(vehiculo);
        return saved;
    }

    @Override
    public boolean deleteCar(String id) throws DaoExceptions, SQLException, ServiceExceptions {
        this.dao = new VehiculoDaoImpl();
        return this.dao.deleteCar(id);
    }

    @Override
    public Vehiculo searchByCode(String codigo) throws DaoExceptions, SQLException, ServiceExceptions {
        Vehiculo result;
        this.dao = new VehiculoDaoImpl();
        result = this.dao.searchByCode(codigo);
        return result;
    }

    @Override
    public Vehiculo updateCar(Vehiculo vehiculo) throws DaoExceptions, SQLException, ServiceExceptions {
        Vehiculo updated;
        this.dao = new VehiculoDaoImpl();
        updated = this.dao.updateCar(vehiculo);
        return updated;
    }
}
