package com.natwest.hashmaps;

public class Runner {
	public static void main(String[] args) {
		MorseTranslator translator = new MorseTranslator();
		System.out.println(translator.noStreamTranslate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
		System.out.println("-------------------------");
	
	}
}
