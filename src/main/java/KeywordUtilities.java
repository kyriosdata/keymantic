import java.util.ArrayList;
import java.util.Iterator;

public class KeywordUtilities {
	private ArrayList<String> archetypes = new ArrayList<String>();

	private ArrayList<String> ontologies = new ArrayList<String>();

	public KeywordUtilities() {

		archetypes.add("adverse reaction list");
		archetypes.add("care plan");
		archetypes.add("encounter");
		archetypes.add("event summary");
		archetypes.add("family history");
		archetypes.add("health summary");

		ontologies.add("at0000 " + "Family history"
				+ "Summary information about the significant health-related problems found in family members.");
	}

	public boolean isArchetypeName(String key) {
		Iterator<String> iterador = archetypes.iterator();

		while (iterador.hasNext()) {
			if (iterador.next().equals(key)) {
				return true;
			}
		}
		return false;
	}

	public boolean isOntologyName(String key) {
		Iterator<String> iterador = ontologies.iterator();

		if (key.trim().isEmpty())
			return false;

		while (iterador.hasNext()) {
			if (iterador.next().contains(key)) {
				return true;
			}
		}
		return false;
	}

	public String[] getArchetypeTerms() {
		ArrayList<String> terms = new ArrayList<String>();
		Iterator<String> iterator = ontologies.iterator();

		while (iterator.hasNext()) {
			terms.add(iterator.next());
		}

		iterator = archetypes.iterator();

		while (iterator.hasNext()) {
			terms.add(iterator.next());
		}

		String[] result = new String[terms.size()];
		result = terms.toArray(result);

		return result;
	}
}
