package MyProjects.coolestHelloWorld;

public class coolestHelloWorld{
	
	public static void main(String[] args) {

		String[] alf = {" ","a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "v", "y", "z","w"};
		String[] str = {"h", "e", "l", "l", "o"," ", "w", "o", "r", "l", "d"};
	//	String[] str = {"a", "l", "p", "e", "r", "e", "n", "k", "u", "r", "t"};
		String[] las = new String[11];
		int j = 0;
		for(int i = 0;i<alf.length;i++){
			if(!alf[i].equals(str[j])){
				System.out.println(alf[i]);
			}
			else if(alf[i].equals(str[j])){
				las[j]=alf[i];
				break;
			}
		}
		j = j + 1;
		for(int i = 0;i<alf.length;i++){
			if(!alf[i].equals(str[j])){
				System.out.println(las[0]+alf[i]);
			}
			else if(alf[i].equals(str[j])){
				las[j]=alf[i];
				break;
			}
		}
		j = j + 1;
		for(int i = 0;i<alf.length;i++){
			if(!alf[i].equals(str[j])){
				System.out.println(las[0]+las[1]+alf[i]);
			}
			else if(alf[i].equals(str[j])){
				las[j]=alf[i];
				break;
			}
		}
		j = j + 1;
		for(int i = 0;i<alf.length;i++){
			if(!alf[i].equals(str[j])){
				System.out.println(las[0]+las[1]+las[2]+alf[i]);
			}
			else if(alf[i].equals(str[j])){
				las[j]=alf[i];
				break;
			}
		}
		j = j + 1;
		for(int i = 0;i<alf.length;i++){
			if(!alf[i].equals(str[j])){
				System.out.println(las[0]+las[1]+las[2]+las[3]+alf[i]);
			}
			else if(alf[i].equals(str[j])){
				las[j]=alf[i];
				break;
			}
		}
		j = j + 1;
		for(int i = 0;i<alf.length;i++){
			if(!alf[i].equals(str[j])){
				System.out.println(las[0]+las[1]+las[2]+las[3]+las[4]+alf[i]);
			}
			else if(alf[i].equals(str[j])){
				las[j]=alf[i];
				break;
			}
		}
		j = j + 1;
		for(int i = 0;i<alf.length;i++){
			if(!alf[i].equals(str[j])){
				System.out.println(las[0]+las[1]+las[2]+las[3]+las[4]+las[5]+alf[i]);
			}
			else if(alf[i].equals(str[j])){
				las[j]=alf[i];
				break;
			}
		}
		j = j + 1;
		for(int i = 0;i<alf.length;i++){
			if(!alf[i].equals(str[j])){
				System.out.println(las[0]+las[1]+las[2]+las[3]+las[4]+las[5]+las[6]+alf[i]);
			}
			else if(alf[i].equals(str[j])){
				las[j]=alf[i];
				break;
			}
		}
		j = j + 1;
		for(int i = 0;i<alf.length;i++){
			if(!alf[i].equals(str[j])){
				System.out.println(las[0]+las[1]+las[2]+las[3]+las[4]+las[5]+las[6]+las[7]+alf[i]);
			}
			else if(alf[i].equals(str[j])){
				las[j]=alf[i];
				break;
			}
		}
		j = j + 1;
		for(int i = 0;i<alf.length;i++){
			if(!alf[i].equals(str[j])){
				System.out.println(las[0]+las[1]+las[2]+las[3]+las[4]+las[5]+las[6]+las[7]+las[8]+alf[i]);
			}
			else if(alf[i].equals(str[j])){
				las[j]=alf[i];
				break;
			}
		}
		j = j + 1;
		for(int i = 0;i<alf.length;i++){
			if(!alf[i].equals(str[j])){
				System.out.println(las[0]+las[1]+las[2]+las[3]+las[4]+las[5]+las[6]+las[7]+las[8]+las[9]+alf[i]);
			}
			else if(alf[i].equals(str[j])){
				las[j]=alf[i];
				break;
			}
		}
		System.out.println(las[0]+las[1]+las[2]+las[3]+las[4]+las[5]+las[6]+las[7]+las[8]+las[9]+las[10]);

	}
}