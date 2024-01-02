package stringbuffers;

public class Java_stringbuffers {
	public static void main(String[] args) {
		StringBuffer st=new StringBuffer("welcome");
		//st.append("marolix");
		//st.reverse();
		//st.replace(0, 1, "m");
		//st.delete(0, 5);
		//st.deleteCharAt(2);
		st.insert(0, "m");
		System.out.println(st);
	}

}
