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