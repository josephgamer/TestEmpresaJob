package testEmpresa.dao;

import testEmpresa.excepciones.DaoExceptions;
import testEmpresa.excepciones.ServiceExceptions;
import testEmpresa.model.Vehiculo;
import org.hibernate.Session;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.sql.SQLException;
import java.util.List;

public class VehiculoDaoImpl implements VehiculoDao{
    private final Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public List<Vehiculo> listCars() throws DaoExceptions, SQLException, ServiceExceptions {
        //Session session = HibernateUtil.getSessionFactory().openSession();
        String query = "from auto";
        List<Vehiculo> vehiculoList;
        session.beginTransaction();

        vehiculoList = session.createQuery(query, Vehiculo.class).list();
        session.getTransaction().commit();

        return vehiculoList;
    }

    @Override
    public Vehiculo insertCar(Vehiculo vehiculo) throws DaoExceptions, SQLException, ServiceExceptions {
        //Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(vehiculo);
        session.getTransaction().commit();
        return vehiculo;
    }

    @Override
    public boolean deleteCar(String codigo) throws DaoExceptions, SQLException, ServiceExceptions {
        //Session session = HibernateUtil.getSessionFactory().openSession();
        boolean isDeleted;
        Vehiculo vehiculo;

        session.beginTransaction();
        vehiculo = session.get(Vehiculo.class, codigo);
        session.delete(vehiculo);
        isDeleted = true;
        session.getTransaction().commit();

        return isDeleted;
    }

    @Override
    public Vehiculo searchByCode(String codigo) throws DaoExceptions, SQLException, ServiceExceptions {
        //Session session = HibernateUtil.getSessionFactory().openSession();
        Vehiculo vehiculo;
        session.beginTransaction();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Vehiculo> query = builder.createQuery(Vehiculo.class);
        Root<Vehiculo> root = query.from(Vehiculo.class);
        query.select(root).where(builder.equal(root.get("codigo"), codigo));
        Query q=session.createQuery(query);
        vehiculo= (Vehiculo) q.getSingleResult();

        return vehiculo;
    }

    @Override
    public Vehiculo updateCar(Vehiculo vehiculo) throws DaoExceptions, SQLException, ServiceExceptions {
        //Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(vehiculo);
        session.getTransaction().commit();
        return vehiculo;
    }
}
