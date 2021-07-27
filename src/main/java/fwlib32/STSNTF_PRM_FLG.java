package fwlib32;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class STSNTF_PRM_FLG extends Structure {
	public byte PopSvrPort;
	public byte SmtpSvrPort;
	public USER_ACCOUNT_PRM_FLG[] UserAccount = new USER_ACCOUNT_PRM_FLG[1];
	public STSNTF_PRM_FLG() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("PopSvrPort", "SmtpSvrPort", "UserAccount");
	}
	public STSNTF_PRM_FLG(byte PopSvrPort, byte SmtpSvrPort, USER_ACCOUNT_PRM_FLG UserAccount[]) {
		super();
		this.PopSvrPort = PopSvrPort;
		this.SmtpSvrPort = SmtpSvrPort;
		if ((UserAccount.length != this.UserAccount.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.UserAccount = UserAccount;
	}
	public STSNTF_PRM_FLG(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends STSNTF_PRM_FLG implements Structure.ByReference {
		
	};
	public static class ByValue extends STSNTF_PRM_FLG implements Structure.ByValue {
		
	};
}