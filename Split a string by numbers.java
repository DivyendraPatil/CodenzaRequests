while (index < s.length()) {
			strings[i] = s.substring(index, Math.min(index + upper, s.length()));
			index = index + upper;
			i++;
		}	
