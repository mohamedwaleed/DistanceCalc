package my.orange.algorithm;

public class AlgorithmFactory {

	public static IAlgorithm getInstance(String className)
			throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		// get instance from the algorithm type using reflection

		Class<?> c = Class.forName(className);

		IAlgorithm algorithm = (IAlgorithm) c.newInstance();

		return algorithm;

	}

}
