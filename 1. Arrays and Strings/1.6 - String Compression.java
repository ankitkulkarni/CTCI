public String StrCompression(String str){
	StringBuilder sb = new StringBuilder();
	for(int i = 0; i < str.length(); i++){
		int count = 0;
		char c = str.charAt(i);
		count++;
		while(str.charAt(i) == str.charAt(i + 1)){
			i++;
			count++;
		}
		sb.append(str.charAt(i));
		sb.append(count);
	}
	return sb.length() < str.length() ? sb.toString() : str;
}



public String StrCompression(String str){
	StringBuilder sb = new StringBuilder();
	int count = 0;
	for(int i = 0; i < str.length(); i++){
		count++;
		if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)){
			sb.append(str.charAt(i));
			sb.append(count);
			count = 0;
		}
	}
	return sb.length() < str.length() ? sb.toString() : str;
}