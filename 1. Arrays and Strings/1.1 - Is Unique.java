public boolean isUnique(String str){
	char[] c = str.toCharArray();
	java.util.Arrays.sort(c);
	for(int i = 0; i < str.length(); i++){
		if(str.charAt(i) == str.charAt(i + 1)){
			return false;
		}
		else{
			continue;
		}
	}
	return true;
}



public boolean isUnique(String str){
	char[] c = str.toCharArray();
	Set<Character> set = new HashSet<>();
	for(int i = 0; i < str.length(); i++){
		if(set.contains(str.charAt(i))){
			return false;
		}
		else{
			set.add(str.charAt(i));
		}
	}
	return true;
}