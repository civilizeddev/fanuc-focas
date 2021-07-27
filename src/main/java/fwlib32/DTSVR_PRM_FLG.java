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
public class DTSVR_PRM_FLG extends Structure {
	public FTP_CLIENT_PRM_FLG[] opposite = new FTP_CLIENT_PRM_FLG[3];
	public FTP_SERVER_PRM_FLG own;
	public DTSVR_PRM_FLG() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("opposite", "own");
	}
	public DTSVR_PRM_FLG(FTP_CLIENT_PRM_FLG opposite[], FTP_SERVER_PRM_FLG own) {
		super();
		if ((opposite.length != this.opposite.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.opposite = opposite;
		this.own = own;
	}
	public DTSVR_PRM_FLG(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends DTSVR_PRM_FLG implements Structure.ByReference {
		
	};
	public static class ByValue extends DTSVR_PRM_FLG implements Structure.ByValue {
		
	};
}