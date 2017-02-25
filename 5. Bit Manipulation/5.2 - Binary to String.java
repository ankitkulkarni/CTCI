String printBinary(double num){
	if(num >= 1 || num <= 0){
		return "ERROR";
	}
	StringBuilder sb = new StringBuilder();
	sb.append(".");
	while(num > 0){
		if(sb.length() >= 32){
			return "ERROR";
		}
		double r = num * 2;
		if(r >= 1){
			sb.append(1);
			num = r - 1;
		}
		else{
			sb.append(0);
			num = r;
		}
	}
	return sb.toString();
}

String printBinary2(double num){
	if(num >= 1 || num <= 0){
		return "ERROR";
	}
	StringBuilder sb = new StringBuilder();
	double fraction = 0.5;
	sb.append(".");
	while(num > 0){
		if(sb.length() >= 32){
			return "ERROR";
		}
		if(num >= fraction){
			sb.append(1);
			num -= fraction;
		}
		else{
			sb.append(0);
		}
		fraction /= 2;
	}
	return sb.toString();
}