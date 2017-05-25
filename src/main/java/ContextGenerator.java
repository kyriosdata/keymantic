
public class ContextGenerator {
	private double[][] matrixDePesosDeValor;
	private int constante = 50;
	private KeywordUtilities utilities = new KeywordUtilities();

	public double[][] compute(String[] archetypeTerms, double[][] partialMapToDBTErms, double[][] matrixDePesosDeEsquema, String[] keywords) {
		matrixDePesosDeValor = matrixDePesosDeEsquema;
		matrixDePesosDeValor = initializationPass(matrixDePesosDeValor);

		for (int i = 0; i < keywords.length; i++) {
			if (utilities.isArchetypeName(keywords[i])) {
				for (int j = i; j < keywords.length; j++) {
					if (utilities.isArchetypeName(keywords[j])) {
						break;
					} else {
						keywords[j] = keywords[j] + constante;
					}
				} // end of for

				for (int j = i; j < keywords.length; j--) {
					if (utilities.isArchetypeName(keywords[j])) {
						break;
					} else {
						keywords[j] = keywords[j] + constante;
					}
				}
			} // end of if

			if (utilities.isOntologyName(keywords[i])) {
				for (int j = i; j < keywords.length; j++) {
					if (utilities.isOntologyName(keywords[j])) {
						break;
					} else {
						keywords[j] = keywords[j] + constante;
					}
				} // end of for

				for (int j = i; j < keywords.length; j--) {
					if (utilities.isOntologyName(keywords[j])) {
						break;
					} else {
						keywords[j] = keywords[j] + constante;
					}
				}
			} // end of if

		}

		return null;
	}

	public double[][] initializationPass(double[][] matrix) {
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[0].length; y++) {
				if (matrix[x][y] != 0) {
					matrix[x][y] = 0;
				} else {
					matrix[x][y] = 1;
				}
			}
		}

		return matrix;
	}
}
