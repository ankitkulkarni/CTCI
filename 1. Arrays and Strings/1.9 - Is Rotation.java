public boolean(String str1, String str2){
	int length = str1.length();
	if(length == str2.length() && length > 0){
		String temp = str1 + str1;
		return temp.contains(str2);
	}
	return false;
}