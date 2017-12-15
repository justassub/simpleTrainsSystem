package lt.it.akademija.Repositories;


import lt.it.akademija.Vagonai.Vagonas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VagonasRepository extends JpaRepository<Vagonas,Long> {
    Vagonas save(Vagonas vagonas);

//    @Query("select SUM (kiekis*kaina) from vagonas where train_id=?1")
//    double trainPrice(long id);


}
