package lt.it.akademija.Repositories;


import lt.it.akademija.Vagonai.Vagonas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VagonasRepository extends JpaRepository<Vagonas,Long> {
    Vagonas save(Vagonas vagonas);

}
