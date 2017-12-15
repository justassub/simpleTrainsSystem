package lt.it.akademija.Repositories;

import lt.it.akademija.Trains.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainRepository  extends JpaRepository<Train,Long>{
    List<Train> findAll();
    Train save(Train train);

}
