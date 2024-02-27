package MyProjects.coolestHelloWorld;

public class coolestHelloWorld{

	public static void main(String[] args) {

		String[] alf = {" ","a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "v", "y", "z","w"};
		String[] str = {"h", "e", "l", "l", "o"," ", "w", "o", "r", "l", "d"};
	//	String[] str = {"a", "l", "p", "e", "r", "e", "n", "k", "u", "r", "t"};
		String las = "";
		for(int j = 0; j < str.length; j++){
			for(int i = 0; i < alf.length; i++){ 
				if(!alf[i].equals(str[j])){
					System.out.println(las + alf[i]);
				}
				else if(alf[i].equals(str[j])){ 
					las += alf[i];
					break;
				}
			}
		}
        System.out.println(las);
	}
}