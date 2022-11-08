package kodlamaio.programmingLanguages.business.responses.languages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetProgrammingLanguagesByIdResponse {

	private int id;
	private String name;
}
