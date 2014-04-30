package spring.tutorial;

public class TextEditor {
	private SpellChecker spellChecker;
	
	/**
	 * test inner bean, can't create this constructor in the outside bean
	 * ?No default constructor found; nested exception is java.lang.NoSuchMethodException: spring.tutorial.TextEditor.<init>()
	 */
//	public TextEditor(SpellChecker spellChecker){
//		System.out.println("Inside TextEditor constructor");		
//		this.spellChecker = spellChecker;
//	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setter");
		this.spellChecker = spellChecker;
	}

	public void checkSpell(){
		spellChecker.checkSpell();
	}
}
