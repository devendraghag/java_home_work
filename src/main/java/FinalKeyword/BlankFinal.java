package FinalKeyword;

class BlankFinal {
	final int speedlimit;// blank final variable

	BlankFinal(){  
	  speedlimit=70;  
	  System.out.println(speedlimit);  
	  }

	public static void main(String args[]) {
		new BlankFinal();
	}
}


//Can we initialize blank final variable?
//Yes, but only in constructor