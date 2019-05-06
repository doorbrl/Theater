package sqlTest;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class DtoMillion {
	@Setter
	@Getter
	private int id;

	@Setter
	@Getter
	private String name;

	@Setter
	@Getter
	private int year;

	@Setter
	@Getter
	private String from;

	@Setter
	@Getter
	private String hand;

	@Setter
	@Getter
	private int birthday;

	@Setter
	@Getter
	private String blood;

	@Setter
	@Getter
	private String attribute;

	@Setter
	@Getter
	private int ssr_1;

	@Setter
	@Getter
	private int ssr_fes;

	@Setter
	@Getter
	private int mainstory_1;
}
