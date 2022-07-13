package testEmpresa.dao;

import testEmpresa.excepciones.DaoExceptions;
import testEmpresa.excepciones.ServiceExceptions;
import testEmpresa.model.Vehiculo;

import java.sql.SQLException;
import java.util.List;

public interface VehiculoDao {
    List<Vehiculo> listCars() throws DaoExceptions, SQLException, ServiceExceptions;
    Vehiculo insertCar(Vehiculo vehiculo) throws DaoExceptions, SQLException, ServiceExceptions;
    boolean deleteCar(String codigo) throws DaoExceptions, SQLException, ServiceExceptions;
    Vehiculo searchByCode(String codigo) throws DaoExceptions, SQLException, ServiceExceptions;
    Vehiculo updateCar(Vehiculo vehiculo) throws DaoExceptions, SQLException, ServiceExceptions;
}
