package Lists;

import java.util.Comparator;

public class ComparatorGatosIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato o1, Gato o2) {
		return Integer.compare(o1.getIdade(), o2.getIdade());
	}

}
