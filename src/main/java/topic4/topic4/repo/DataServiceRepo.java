package topic4.topic4.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import topic4.topic4.model.Data;

@Repository
public interface DataServiceRepo extends JpaRepository<Data, Long> {
	// get Max value of column "positionY" in datatable
	@Query("select MAX(d.position_y) from Data d")
	int maxPositionY();

	// get Max value of column "positionX" in datatable
	@Query("select MAX(d.position_x) from Data d")
	int maxPositionX();
}
