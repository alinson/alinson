package br.edu.uniritter.examples;

public class Caesar {  
	
	private String original;
	private int k;
	public Caesar (String original, int k) {
		this.original = original;
		this.k = k;		
	}
	
    public String cifra() {          
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";  
                        
        StringBuilder resultado = new StringBuilder();  
        for (char ch : original.toLowerCase().toCharArray())  
        {  
            if (ch == ' ') {  
                resultado.append(' ');  
                continue;  
            }  
              
            int chr = ch - alfabeto.charAt(0);  
            chr = (chr + k) % alfabeto.length();  
            if (chr < 0)  
                chr += alfabeto.length();  
            chr += alfabeto.charAt(0);  
            resultado.append((char)chr);  
        }  
        return resultado.toString();  
    }  
      
	public String getOriginal() {
		return original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}  
}  