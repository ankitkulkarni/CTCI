public boolean isUniqueV2(String str){
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