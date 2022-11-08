package kodlamaio.programmingLanguages.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.programmingLanguages.entities.concretes.Technology;

public interface TechnologyRepository extends JpaRepository<Technology,Integer> {

}
