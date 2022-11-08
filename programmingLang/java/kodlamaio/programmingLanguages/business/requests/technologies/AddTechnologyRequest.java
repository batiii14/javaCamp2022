package kodlamaio.programmingLanguages.business.requests.technologies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddTechnologyRequest {

	private String name;
	private int languageId;
}
