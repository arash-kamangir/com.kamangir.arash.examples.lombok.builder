package com.kamangir.arash.lombok.builder;

public class NutritionFactsTest {

	public static void main(String[] args) {
		NutritionFacts cocaCola = NutritionFacts.builder(240, 8)
				                                                         .calories(100)
				                                                         .sodium(35)
				                                                         .carbohydrate(27)
				                                                         .build();
	}

}
