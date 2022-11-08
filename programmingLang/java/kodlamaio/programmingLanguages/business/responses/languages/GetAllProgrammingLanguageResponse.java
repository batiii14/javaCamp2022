package kodlamaio.programmingLanguages.business.responses.languages;

import java.util.List;

import kodlamaio.programmingLanguages.entities.concretes.Technology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProgrammingLanguageResponse {

	private int id;
	private String name;
	private List<Technology> technologies;
}
