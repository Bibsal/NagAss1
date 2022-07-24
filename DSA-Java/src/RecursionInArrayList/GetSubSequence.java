package RecursionInArrayList;
import java.util.*;
public class GetSubSequence {
	
//	Steps for debugging of any code :-
//	1. Use System.out.print(), and try printing the variables which are giving errors and use this syso before the line number i.e giving error.
//	2. If you're using any IDE then using breakpoints for debugging is also very beneficial. Like here in eclipse you have the sign/icon of insect above in the toolbox which you can use and set some breakpoints between anylines where ever you want to know the outputs. and in the sidebar you'll be able to see all the values which has executed till now or till the breakpoint jo v value bana hai wo side bar mae variables section mae aa jata hai and here according to the value's of the variables you'll get to know the error's of your code. ki kahi value galat tho nahi dalla hua hai variable me.. so this way you can even check the errors or debug your code.
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		scn.close();
		ArrayList<String> arrstr = gss(str);         // gss -> getSubSequence();
		System.out.println(arrstr);
	}
	
	public static ArrayList<String> gss(String str) {
		if(str.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		// abc  -->>  [---, --c, -b-, -bc, a--, a-c, ab-, abc]
		// half half me kam karnge, phle bc jo ros me substring liye hai niche usko loop me blank or dash k sath add karnge and then in another loop usko ch (i.e a) k sath add karnge. 
		char ch = str.charAt(0);          // a
		String ros = str.substring(1);    // bc
		
		ArrayList<String> rres = gss(ros);           // faith, ki hum abc me sae a ka kam kar dnge, ab aap bc ka kam kar dijye
		ArrayList<String> myarrlst = new ArrayList<>();    // creating a new arraylist so that we can add/store all the subSequences in one arraylist
		
		for(String s : rres) {             // so now from this recursionResult will be added to the string s and it'll be added to our/myarrlst
			myarrlst.add("-" + s);               // so this will make/isme hamare pas [---,--c,-b-,-bc] add ho jaiga 
		}
		
		for(String s : rres) {
			myarrlst.add(ch + s);
		}
		
		return myarrlst;
		
	}
}
