import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

public class practice {

	public static void main(String[] args) {
		
		String pwd = "김하민1234";
	    	    
        String pwd_hash = DigestUtils.sha256Hex(pwd); 
        
        //System.out.println(pwd_hash);
        
        String str = "JAVA";
        String str1 = "java?";
        
        // 대소문자 무시하고 str과 str1 비교.
        boolean bool = StringUtils.equalsIgnoreCase(str, str1);
        System.out.println("equalsIgnoreCase : " + bool);
	}
}



