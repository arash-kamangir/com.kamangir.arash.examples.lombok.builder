package com.kamangir.arash.lombok.builder;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 * Uncle Bobs builder example for constructors with many required & optional parameters,
 * realized by lombok.
 * 
 * @author https://github.com/arash-kamangir
 */
@AllArgsConstructor(access=AccessLevel.PRIVATE) // Let lombok generate private c-tor with all parameters, as needed by @Builder.
@Builder(
		builderClassName="Builder", // Cosmetic. Without this option, the builder class would have the name NutritionFactsBuilder.
		toBuilder=true // Enabling creation of a builder instance based on a main class instance: NutritionFacts. 
)
public class NutritionFacts {

	// Required parameters
	private int servingSize;
	private int servings;
	
	// Optional parameters
	private int calories;
	private int fat;
	private int sodium;
	private int carbohydrate;
	
	/**
	 * A builder method demanding required parameters.
	 */
	public static Builder builder(int servingSize, int servings) {
		return new NutritionFacts(servingSize, servings).toBuilder();
	}

	/**
	 * eclipse-created C-tor with required parameters.
	 * Can be public for instantiating, but doesn't have to.
	 */
	public NutritionFacts(int servingSize, int servings) {
		super();
		this.servingSize = servingSize;
		this.servings = servings;
	}
}
