public boolean checkPermutation(String s, String t){
	if(s.length() != t.length()){
		return false;
	}
	char[] c = s.toString();
	char[] d = t.toString();
	java.util.Arrays.sort(c);
	java.util.Arrays.sort(d);
	for(int i = 0; i < c.length; i++){
		if(c[i] != d[i]){
			return false;
		}
	}
	//return java.util.Arrays.equals(c, d);
	return true;
}