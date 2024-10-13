package co.edu.usco.pw.springJPA_CRUD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.usco.pw.springJPA_CRUD.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
